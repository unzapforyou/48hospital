package com.seoul.his.log.base.service;

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
public interface LogBaseServiceFacade {

    List<GdsBean> findGdsList(Map<String, String> queryMap);

    Map<String, List<OutLogCdBean>> bindLogCd(List<BindLogCdBean> bindLogCdList);

    List<BigGrpCdBean> findGrpList(Map<String, String> queryMap);

    List<WhBean> findWhList(Map<String, String> queryMap);

    void modifyWh(List<WhBean> whList);

    String callGdsCd(Map<String, String> argsMap);

    void batchGdsProcess(List<GdsBean> gdsList);

    void batchGdsGrpCdProcess(List<BigGrpCdBean> bigGrpCdList, List<MidGrpCdBean> midGrpCdList, List<SmGrpCdBean> smGrpCdList);

    List<CustBean> findCustList(Map<String, String> argsMap);

    void batchCustProcess(List<CustBean> custList);
}
