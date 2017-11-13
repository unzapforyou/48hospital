package com.seoul.his.com.system.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.com.system.exception.AuthMenuNotFoundException;
import com.seoul.his.com.system.to.MenuBean;

public interface MenuApplicationService {

    public void findMenu(Map<String, String> argsMap) throws AuthMenuNotFoundException;

    public List<MenuBean> findAuthMenuList(Map<String, String> argsMap);

    public List<MenuBean> findAllMenu();

    public List<MenuBean> findMenuList();

    public void batchMenuProcess(List<MenuBean> menu);
}
