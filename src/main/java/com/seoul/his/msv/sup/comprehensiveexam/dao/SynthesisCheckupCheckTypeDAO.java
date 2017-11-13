package com.seoul.his.msv.sup.comprehensiveexam.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.sup.comprehensiveexam.to.ChoiceCheckBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.CodePopupBean;
import com.seoul.his.msv.sup.comprehensiveexam.to.SynthesisCheckupCheckTypeBean;





public interface SynthesisCheckupCheckTypeDAO {
    /* 종합검진 검사종류관리 - 조회 */
    List<SynthesisCheckupCheckTypeBean> selectSynthesisCheckupCheckTypeList(Map<String, String> argsMap);

    /* 종합검진 검사종류관리 - 수정, 추가*/
    void updateSynthesisCheckupCheckType(SynthesisCheckupCheckTypeBean synthesisCheckupCheckTypeBean);
    void insertSynthesisCheckupCheckType(SynthesisCheckupCheckTypeBean synthesisCheckupCheckTypeBean);

    /* 종합검진 검사종류관리 - 처방코드 조회 */
    List<CodePopupBean> selectOcsCodeList(Map<String, String> argsMap);
    
    /* 종합검진 검사관리 - 선택 검사목록 조회*/
    List<ChoiceCheckBean> selectChoInspList(Map<String, String> argsMap);
    
    /* 종합검진 검사관리 - 선택 검사목록외 조회*/
    List<SynthesisCheckupCheckTypeBean> selectExChoInspList(Map<String, String> argsMap);

  void insertChoInsp(ChoiceCheckBean choInsp);
  void deleteChoInsp(ChoiceCheckBean choInsp);
  void updateChoInsp(ChoiceCheckBean choInsp);
}
