package com.seoul.his.log.inpt.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.inpt.to.SkillExmntHistBean;

public interface SkillExmntDAO {

	// 기술검사조회
	public List<SkillExmntHistBean> selectSkillExmntHistList(Map<String, String> queryMap);
	// 기술검사 등록
	public void insertSkillExmnt(SkillExmntHistBean SkillExmntHistbean);
	// 기술검사 삭제
    public void deleteSkillExmnt(SkillExmntHistBean SkillExmntHistbean);

}
