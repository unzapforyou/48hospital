package com.seoul.his.com.system.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.seoul.his.com.system.applicationService.AuthApplicationService;
import com.seoul.his.com.system.applicationService.CodeApplicationService;
import com.seoul.his.com.system.applicationService.LoginApplicationService;
import com.seoul.his.com.system.applicationService.MenuApplicationService;
import com.seoul.his.com.system.applicationService.ServiceApplicationService;
import com.seoul.his.com.system.exception.AuthMenuNotFoundException;
import com.seoul.his.com.system.exception.IdNotFoundException;
import com.seoul.his.com.system.exception.PwMissMatchException;
import com.seoul.his.com.system.to.AuthBean;
import com.seoul.his.com.system.to.BindCodeBean;
import com.seoul.his.com.system.to.CodeBean;
import com.seoul.his.com.system.to.CodeNmBean;
import com.seoul.his.com.system.to.MenuBean;
import com.seoul.his.com.system.to.OutCodeBean;
import com.seoul.his.com.system.to.ServiceBean;

/**
 * @Package  com.seoul.his.com.base.service
 * @Class    ComBaseServiceFacadeImpl.java
 * @Create   2016. 5. 26.
 * @Author   godseop
 * @Description 시스템공통 서비스퍼사드
 *
 * @LastUpdated
 */
@Service
public class ComBaseServiceFacadeImpl implements ComBaseServiceFacade {

    @Autowired
    private AuthApplicationService authApplicationService;
    @Autowired
    private MenuApplicationService menuApplicationService;
    @Autowired
    private CodeApplicationService codeApplicationService;
    @Autowired
    private LoginApplicationService loginApplicationService;
    @Autowired
    private ServiceApplicationService serviceApplicationService;

    // 로그인
    @Override
    public Map<String, Object> login(Map<String, String> argsMap)
            throws IdNotFoundException, PwMissMatchException {
        return loginApplicationService.login(argsMap);
    }

    // 코드
    @Override
    public List<CodeBean> findCodeList(Map<String, String> argsMap) {
        return codeApplicationService.findCodeList(argsMap);
    }

    @Override
    public List<CodeNmBean> findCode(Map<String, String> argsMap) {
        return codeApplicationService.findCode(argsMap);
    }


    @Override
    public void batchCodeProcess(List<CodeBean> codeList) {
        codeApplicationService.batchCodeProcess(codeList);
    }

    @Override
    public List<CodeNmBean> findCodePopupList(Map<String, String> argsMap) {
        return codeApplicationService.findCodePopupList(argsMap);
    }

    // 권한
    @Override
    public List<AuthBean> findAuthList(Map<String, String> argsMap) {
        return authApplicationService.findAuthList(argsMap);
    }

    @Override
    public void batchAuthProcess(List<AuthBean> auth) {
        authApplicationService.batchAuthProcess(auth);
    }

    // 메뉴
    @Override
    public void findMenu(Map<String, String> argsMap) throws AuthMenuNotFoundException {
        menuApplicationService.findMenu(argsMap);
    }

    @Override
    public List<MenuBean> findAuthMenuList(Map<String, String> argsMap) {
        return menuApplicationService.findAuthMenuList(argsMap);
    }

    @Override
    public List<MenuBean> findMenuList() {
        return menuApplicationService.findMenuList();
    }

    @Override
    public List<MenuBean> findAllMenu() {
        return menuApplicationService.findAllMenu();
    }

    @Override
    public void batchMenuProcess(List<MenuBean> menu) {
        menuApplicationService.batchMenuProcess(menu);
    }

    // 시스템에러 전산요청
    @Override
    public List<ServiceBean> findService(Map<String, String> argsMap) {
        return serviceApplicationService.findService(argsMap);
    }

    @Override
    public void batchErrorProcess(List<ServiceBean> service) {
        serviceApplicationService.batchErrorProcess(service);
    }
    
    //코드 바인드
    @Override
    public Map<String, List<OutCodeBean>> bindCode(List<BindCodeBean> bindCodeList)
            throws DataAccessException {

        return codeApplicationService.bindCode(bindCodeList);
    }


	@Override
	public void insertLog(String id, String time) {
		 serviceApplicationService.insertLog(id,time);
	}
}
