package com.seoul.his.log.base.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.base.to.BigGrpCdBean;
import com.seoul.his.log.base.to.MidGrpCdBean;
import com.seoul.his.log.base.to.OutLogCdBean;
import com.seoul.his.log.base.to.SmGrpCdBean;

public interface GdsGrpCdDAO {

    List<OutLogCdBean> selectBindBgrpCdList(String code);

    List<OutLogCdBean> selectBindMgrpCdList(Map<String, String> argsMap);

    List<OutLogCdBean> selectBindSgrpCdList(Map<String, String> argsMap);

    List<BigGrpCdBean> selectGrpList(Map<String, String> argsMap);

    void insertBigGrpCd(BigGrpCdBean bigGrpCdBean);

    void updateBigGrpCd(BigGrpCdBean bigGrpCdBean);

    void insertMidGrpCd(MidGrpCdBean midGrpCdBean);

    void updateMidGrpCd(MidGrpCdBean midGrpCdBean);

    void insertSmGrpCd(SmGrpCdBean smGrpCdBean);

    void updateSmGrpCd(SmGrpCdBean smGrpCdBean);
    
    void deleteBigGrpCd(BigGrpCdBean bigGrpCdBean);
    
    void deleteMidGrpCd(MidGrpCdBean midGrpCdBean);
    
    void deleteSmGrpCd(SmGrpCdBean smGrpCdBean);
}
