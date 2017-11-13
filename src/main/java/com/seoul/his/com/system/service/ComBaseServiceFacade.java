package com.seoul.his.com.system.service;

import java.util.List;
import java.util.Map;

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

public interface ComBaseServiceFacade {
    // 로그인
    public Map<String, Object> login(Map<String, String> argsMap)
            throws IdNotFoundException, PwMissMatchException;

    // 코드
    public List<CodeBean> findCodeList(Map<String, String> argsMap);

    public void batchCodeProcess(List<CodeBean> codeList);

    public List<CodeNmBean> findCodePopupList(Map<String, String> argsMap);

    public List<CodeNmBean> findCode(Map<String, String> argsMap);

    // 권한
    public List<AuthBean> findAuthList(Map<String, String> argsMap);

    public void batchAuthProcess(List<AuthBean> auth);

    // 메뉴
    public void findMenu(Map<String, String> argsMap) throws AuthMenuNotFoundException;

    public List<MenuBean> findAuthMenuList(Map<String, String> argsMap);

    public List<MenuBean> findAllMenu();

    public List<MenuBean> findMenuList();

    public void batchMenuProcess(List<MenuBean> menu);

    // 전산서비스접수
    public List<ServiceBean> findService(Map<String, String> argsMap);

    public void batchErrorProcess(List<ServiceBean> service);
    
    // 코드 바인드
    public Map<String, List<OutCodeBean>> bindCode(List<BindCodeBean> bindCodeList);
   
    //restful 접속 로그
	public void insertLog(String id, String time);
}
