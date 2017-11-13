package com.seoul.his.msv.sup.comprehensiveexam.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.comprehensiveexam.to.PackgeBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupCheckTypeBean;



public interface PackgeDAO {
    /* 종합검진 접수 - 패키지 조회 */
    List<PackgeBean> selectPckList(Map<String, String> argsMap);
    
    /* 종합검진 패키지관리 - 패키지 검사 조회 */
    List<SynthesisCheckupCheckTypeBean> selectPckInspList(Map<String, String> argsMap);

    /* 종합검진 패키지관리 - 저장*/
    void insertPck(PackgeBean packgeBean);
    void updatePck(PackgeBean packgeBean);
    void deletePck(PackgeBean packgeBean);
    void deletePckInsp(PackgeBean packgeBean);
    void insertPckInsp(SynthesisCheckupCheckTypeBean synthesisCheckupCheckTypeBean);
    void deletePckInsp2(SynthesisCheckupCheckTypeBean synthesisCheckupCheckTypeBean);
    
    /* 종합검진 패키지관리 - EX 패키지 조회 */
    List<SynthesisCheckupCheckTypeBean> selectExPckInspList(Map<String, String> argsMap);



    


}
