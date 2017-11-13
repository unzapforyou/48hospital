package com.seoul.his.log.inpt.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.inpt.to.CtrtInfoBean;
import com.seoul.his.log.inpt.to.SkillExmntHistBean;

public interface SkillExApplicationService {

	// 기술검사조회
	public List<SkillExmntHistBean> findSkillExmntHistList(Map<String, String> queryMap);
	// 기술검사 일괄처리
	public void batchProcessSkillExmntHist(List<SkillExmntHistBean> skillExmntHisList, CtrtInfoBean ctrtInfoBean);

}
