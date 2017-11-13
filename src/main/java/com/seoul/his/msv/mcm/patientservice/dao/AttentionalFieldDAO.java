package com.seoul.his.msv.mcm.patientservice.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.msv.mcm.patientservice.to.AttentionalFieldBean;


public interface AttentionalFieldDAO {

	List<AttentionalFieldBean> selectAttentionalFieldList(Map<String, String> argsMap);
    void insertAttentionalField(AttentionalFieldBean attentionalField);
    void updateAttentionalField(AttentionalFieldBean attentionalField);
    void deleteAttentionalField(AttentionalFieldBean attentionalField);

}
