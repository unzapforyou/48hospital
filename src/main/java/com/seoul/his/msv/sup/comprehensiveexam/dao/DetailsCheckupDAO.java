package com.seoul.his.msv.sup.comprehensiveexam.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.comprehensiveexam.to.DetailsCheckupBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupCheckTypeBean;



public interface DetailsCheckupDAO {
    /* 종합검진 세부검사관리 - 검사 조회 */
    List<SynthesisCheckupCheckTypeBean> selectSimpleCheckupList(Map<String, String> argsMap);

    /* 종합검진 세부검사관리 - 세부검사 조회 */
    List<DetailsCheckupBean> selectDetailsCheckupList(Map<String, String> argsMap);

    /* 종합검진 검사관리 - 수정, 추가*/
    void insertDetailsCheckup(DetailsCheckupBean detailsCheckupBean);
    void updateDetailsCheckup(DetailsCheckupBean detailsCheckupBean);
}
