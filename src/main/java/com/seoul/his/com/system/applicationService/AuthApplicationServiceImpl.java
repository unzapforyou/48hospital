package com.seoul.his.com.system.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.com.system.dao.AuthDAO;
import com.seoul.his.com.system.to.AuthBean;

@Component
public class AuthApplicationServiceImpl implements AuthApplicationService {

    @Autowired
    private AuthDAO authDAO;

    @Override
    public List<AuthBean> findAuthList(Map<String, String> argsMap) {
        return authDAO.selectAuthList(argsMap);
    }

    @Override
    public void batchAuthProcess(List<AuthBean> auth) {
        for (AuthBean authBean : auth) {
            if (authBean.getStatus().equals("inserted")) {
                authDAO.insertAuth(authBean);
            } else if (authBean.getStatus().equals("updated")) {
                authDAO.updateAuth(authBean);
            } else if (authBean.getStatus().equals("deleted")) {
                authDAO.deleteAuth(authBean);
            }
        }

    }
}
