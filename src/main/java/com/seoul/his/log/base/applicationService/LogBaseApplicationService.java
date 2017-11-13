package com.seoul.his.log.base.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.seoul.his.log.base.to.BigGrpCdBean;
import com.seoul.his.log.base.to.BindLogCdBean;
import com.seoul.his.log.base.to.CustBean;
import com.seoul.his.log.base.to.GdsBean;
import com.seoul.his.log.base.to.MidGrpCdBean;
import com.seoul.his.log.base.to.OutLogCdBean;
import com.seoul.his.log.base.to.SmGrpCdBean;
import com.seoul.his.log.base.to.WhBean;

@Service
public interface LogBaseApplicationService {

    Map<String, List<OutLogCdBean>> bindLogCd(List<BindLogCdBean> bindLogCdList);

    List<GdsBean> findGdsList(Map<String, String> argsMap);

    String callGdsCd(Map<String, String> argsMap);

    void batchGdsProcess(List<GdsBean> gdsList);

    List<BigGrpCdBean> findGrpList(Map<String, String> argsMap);

    void batchGdsGrpCdProcess(List<BigGrpCdBean> bigGrpCdList, 
                              List<MidGrpCdBean> midGrpCdList,
                              List<SmGrpCdBean> smGrpCdList);

    List<WhBean> findWhList(Map<String, String> argsMap);

    void modifyWh(List<WhBean> whList);

    List<CustBean> findCustList(Map<String, String> argsMap);

    void batchCustProcess(List<CustBean> custList);
}
