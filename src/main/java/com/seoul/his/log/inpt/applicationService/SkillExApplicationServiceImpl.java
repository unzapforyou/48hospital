package com.seoul.his.log.inpt.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.log.inpt.dao.InptDAO;
import com.seoul.his.log.inpt.dao.SkillExmntDAO;
import com.seoul.his.log.inpt.to.CtrtInfoBean;
import com.seoul.his.log.inpt.to.SkillExmntHistBean;

@Component
public class SkillExApplicationServiceImpl implements SkillExApplicationService {

	@Autowired
    private SkillExmntDAO skillExmntDao;
	@Autowired
    private InptDAO inptDao;

	// 기술검사조회
	@Override
	public List<SkillExmntHistBean> findSkillExmntHistList(Map<String, String> queryMap) {
		return skillExmntDao.selectSkillExmntHistList(queryMap);
	}

	// 기술검사 일괄처리
	@Override
	public void batchProcessSkillExmntHist(List<SkillExmntHistBean> skillExmntHisList, CtrtInfoBean ctrtInfoBean) {
		for(SkillExmntHistBean skillExmntHistBean : skillExmntHisList){
			switch (skillExmntHistBean.getStatus()) {
			case "insert" :
				skillExmntDao.insertSkillExmnt(skillExmntHistBean);
				inptDao.updateCtrtInfoY(ctrtInfoBean);
				break;
			case "deleted" :
				skillExmntDao.deleteSkillExmnt(skillExmntHistBean);
            	inptDao.updateCtrtInfoN(ctrtInfoBean);
            	break;
            }
		}
	}

}
