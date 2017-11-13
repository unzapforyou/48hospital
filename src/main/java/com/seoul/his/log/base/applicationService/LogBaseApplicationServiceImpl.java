package com.seoul.his.log.base.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.log.base.dao.CustDAO;
import com.seoul.his.log.base.dao.GdsDAO;
import com.seoul.his.log.base.dao.GdsGrpCdDAO;
import com.seoul.his.log.base.dao.WhDAO;
import com.seoul.his.log.base.to.BigGrpCdBean;
import com.seoul.his.log.base.to.BindLogCdBean;
import com.seoul.his.log.base.to.CustBean;
import com.seoul.his.log.base.to.GdsBean;
import com.seoul.his.log.base.to.MidGrpCdBean;
import com.seoul.his.log.base.to.OutLogCdBean;
import com.seoul.his.log.base.to.SmGrpCdBean;
import com.seoul.his.log.base.to.WhBean;

@Component
public class LogBaseApplicationServiceImpl implements LogBaseApplicationService {
    
    @Autowired
    GdsDAO gdsDAO;
    @Autowired
    GdsGrpCdDAO grpCdDAO;
    @Autowired
    WhDAO whDAO;
    @Autowired
    CustDAO custDAO;

    @Override
    public Map<String, List<OutLogCdBean>> bindLogCd(List<BindLogCdBean> bindLogCdList) {
        Map<String, List<OutLogCdBean>> bingLogCdMap = new HashMap<String, List<OutLogCdBean>>();
        for (BindLogCdBean bindLogCdBean : bindLogCdList) {
            if (bindLogCdBean.getCdDiv().equals("gds")) {
                Map<String, String> argsMap = setArgsMap(bindLogCdBean);
                bingLogCdMap.put(bindLogCdBean.getDsLogName(), gdsDAO.selectBindGdsCdList(argsMap));
            } else if (bindLogCdBean.getCdDiv().equals("wh")) {
                Map<String, String> argsMap = setArgsMap(bindLogCdBean);
                bingLogCdMap.put(bindLogCdBean.getDsLogName(), whDAO.selectBindWhCdList(argsMap));
            } else if (bindLogCdBean.getCdDiv().equals("cust")) {
                Map<String, String> argsMap = setArgsMap(bindLogCdBean);
                bingLogCdMap.put(bindLogCdBean.getDsLogName(), custDAO.selectBindCustCdList(argsMap));
            } else if (bindLogCdBean.getCdDiv().equals("searchBigGrp")
                    || bindLogCdBean.getCdDiv().equals("addBigGrp")) {
                bingLogCdMap.put(bindLogCdBean.getDsLogName(), grpCdDAO.selectBindBgrpCdList(bindLogCdBean.getCode()));
            } else if (bindLogCdBean.getCdDiv().equals("searchMidGrp")
                    || bindLogCdBean.getCdDiv().equals("addMidGrp")) {
                Map<String, String> argsMap = new HashMap<String, String>();
                String code = bindLogCdBean.getCode();
                String secCode = bindLogCdBean.getSecCode();
                argsMap.put("code", code);
                argsMap.put("secCode", secCode);
                bingLogCdMap.put(bindLogCdBean.getDsLogName(), grpCdDAO.selectBindMgrpCdList(argsMap));
            } else if (bindLogCdBean.getCdDiv().equals("searchSmGrp") || bindLogCdBean.getCdDiv().equals("addSmGrp")) {
                Map<String, String> argsMap = new HashMap<String, String>();
                String code = bindLogCdBean.getCode();
                String secCode = bindLogCdBean.getSecCode();
                String thrCode = bindLogCdBean.getThrCode();
                argsMap.put("code", code);
                argsMap.put("secCode", secCode);
                argsMap.put("thrCode", thrCode);
                bingLogCdMap.put(bindLogCdBean.getDsLogName(), grpCdDAO.selectBindSgrpCdList(argsMap));
            }
        }
        return bingLogCdMap;
    }

    private Map<String, String> setArgsMap(BindLogCdBean bindLogCdBean) {
        String code = bindLogCdBean.getCode();
        String cdNm = bindLogCdBean.getCdNm();
        Map<String, String> argsMap = new HashMap<String, String>();
        argsMap.put("code", code);
        argsMap.put("cdNm", cdNm);
        return argsMap;
    }

    @Override
    public List<GdsBean> findGdsList(Map<String, String> argsMap) {
        List<GdsBean> gdsList = gdsDAO.selectGdsList(argsMap);
        return gdsList;
    }

    @Override
    public String callGdsCd(Map<String, String> argsMap) {
        String postCode = gdsDAO.callGdsCd(argsMap);
        return postCode;
    }

    @Override
    public void batchGdsProcess(List<GdsBean> gdsList) {
        for (GdsBean gdsBean : gdsList) {
            switch (gdsBean.getStatus()) {
            case "inserted":
                gdsDAO.insertGds(gdsBean);
                break;
            case "updated":
                gdsDAO.updateGds(gdsBean);
                break;
            }
        }
    }

    @Override
    public List<BigGrpCdBean> findGrpList(Map<String, String> argsMap) {
        List<BigGrpCdBean> bigGrpList = grpCdDAO.selectGrpList(argsMap);
        return bigGrpList;
    }

    @Override
    public void batchGdsGrpCdProcess(List<BigGrpCdBean> bigGrpCdList, List<MidGrpCdBean> midGrpCdList,
            List<SmGrpCdBean> smGrpCdList) {
        for (BigGrpCdBean bigGrpCdBean : bigGrpCdList) {
            switch (bigGrpCdBean.getStatus()) {
            case "inserted":
                grpCdDAO.insertBigGrpCd(bigGrpCdBean);
                batchMidGrpCdProcess(bigGrpCdBean.getMidGrpCdList(), smGrpCdList);
                break;
            case "updated":
                grpCdDAO.updateBigGrpCd(bigGrpCdBean);
                batchMidGrpCdProcess(bigGrpCdBean.getMidGrpCdList(), smGrpCdList);
                break;
            case "deleted":
                batchMidGrpCdProcess(bigGrpCdBean.getMidGrpCdList(), smGrpCdList);
                grpCdDAO.deleteBigGrpCd(bigGrpCdBean);
                break;
            }
        }
        batchMidGrpCdProcess(midGrpCdList, smGrpCdList);
    }

    private void batchMidGrpCdProcess(List<MidGrpCdBean> midGrpCdList, List<SmGrpCdBean> smGrpCdList) {
        for (MidGrpCdBean midGrpCdBean : midGrpCdList) {
            switch (midGrpCdBean.getStatus()) {
            case "inserted":
                grpCdDAO.insertMidGrpCd(midGrpCdBean);
                if (midGrpCdBean.getSmGrpCdList() != null) {
                    batchSmGrpCdProcess(midGrpCdBean.getSmGrpCdList());
                }
                break;
            case "updated":
                grpCdDAO.updateMidGrpCd(midGrpCdBean);
                if (midGrpCdBean.getSmGrpCdList() != null) {
                    batchSmGrpCdProcess(midGrpCdBean.getSmGrpCdList());
                }
                break;
            case "deleted":
                if (midGrpCdBean.getSmGrpCdList() != null) {
                    batchSmGrpCdProcess(midGrpCdBean.getSmGrpCdList());
                }
                grpCdDAO.deleteMidGrpCd(midGrpCdBean);
                break;
            }
        }
        if (smGrpCdList.size() != 0) {
            batchSmGrpCdProcess(smGrpCdList);
        }
    }

    private void batchSmGrpCdProcess(List<SmGrpCdBean> smGrpCdList) {
        for (SmGrpCdBean smGrpCdBean : smGrpCdList) {
            switch (smGrpCdBean.getStatus()) {
            case "inserted":
                grpCdDAO.insertSmGrpCd(smGrpCdBean);
                break;
            case "updated":
                grpCdDAO.updateSmGrpCd(smGrpCdBean);
                break;
            case "deleted":
                grpCdDAO.deleteSmGrpCd(smGrpCdBean);
                break;
            }
        }
    }

    @Override
    public List<WhBean> findWhList(Map<String, String> argsMap) {
        List<WhBean> whList = whDAO.selectWhList(argsMap);
        return whList;
    }

    @Override
    public void modifyWh(List<WhBean> whList) {
        for (WhBean whBean : whList) {
            switch (whBean.getStatus()) {
            case "updated":
                whDAO.updateWh(whBean);
                break;
            }
        }
    }

    @Override
    public List<CustBean> findCustList(Map<String, String> argsMap) {
        List<CustBean> custList = custDAO.selectCustList(argsMap);
        return custList;
    }

    @Override
    public void batchCustProcess(List<CustBean> custList) {
        for (CustBean custBean : custList) {
            switch (custBean.getStatus()) {
            case "inserted":
                custDAO.upsertCust(custBean);
                break;
            case "updated":
                custDAO.upsertCust(custBean);
                break;
            }
        }
    }
}
