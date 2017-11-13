package com.seoul.his.acc.closing.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.closing.dao.ClosingDAO;
import com.seoul.his.acc.closing.to.ClosAcntBean;
import com.seoul.his.acc.closing.to.ClosDataBean;
import com.seoul.his.acc.elementary.to.AccPridBean;
import com.seoul.his.acc.resol.dao.JourDAO;
import com.seoul.his.acc.resol.dao.ResolLetDAO;
import com.seoul.his.acc.resol.to.JourBean;
import com.seoul.his.acc.resol.to.ResolLetBean;
import com.seoul.his.acc.slip.dao.SlipDAO;
import com.seoul.his.acc.slip.to.SlipBean;

@Service
public class ClosingApplicationServiceImpl implements ClosingApplicationService{
    @Autowired
    ClosingDAO closingDAO;
    @Autowired
    ResolLetDAO resolLetDAO;
    @Autowired
    SlipDAO slipDAO;
    @Autowired
    JourDAO jourDAO;

    @SuppressWarnings("unchecked")
    @Override
    public List<ClosDataBean> findClosDataList(Map<String, Object> argsMap) {
        closingDAO.selectClosDataList(argsMap);
        return (List<ClosDataBean>)argsMap.get("closDataList");
    }

    @Override
    public List<ClosAcntBean> findClosAcntList(Map<String, String> argsMap) {
        return closingDAO.selectClosAcntList(argsMap);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void registerClosJour(HashMap<String, Object> map) {
        HashMap<String, String> pcMap = new HashMap<String, String>();
        pcMap.put("errorCode", "");
        pcMap.put("errorMsg", "");
        List<ResolLetBean> resolLetList = (List<ResolLetBean>) map.get("resolLetList");
        List<SlipBean> slipList = (List<SlipBean>) map.get("slipList");
        List<JourBean> jourList = (List<JourBean>) map.get("jourList");
        int l = resolLetList.size();
        int j = 0;
        for (int i = 0 ; i<l; i++ ) {
            String resolNo = resolLetDAO.getResolNo();
            ResolLetBean resol = resolLetList.get(i);
            SlipBean slip = slipList.get(i);
            resol.setResolNo(resolNo);
            slip.setResolNo(resolNo);
            resolLetDAO.insertResolLet(resol);
            slipDAO.insertSlip(slip);
            for (int k = 0; k<2; k++, j++ ) {
                JourBean jour = jourList.get(j);
                jour.setSeq(k+"");
                jour.setResolNo(resolNo);
                jourDAO.insertJour(jour);
            }
            pcMap.put("resolNo", resolNo);
            slipDAO.updateSlipNo(pcMap);
        }
    }


}
