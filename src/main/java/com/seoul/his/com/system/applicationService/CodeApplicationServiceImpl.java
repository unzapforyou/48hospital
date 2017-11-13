package com.seoul.his.com.system.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.com.system.dao.CodeDAO;
import com.seoul.his.com.system.to.BindCodeBean;
import com.seoul.his.com.system.to.CodeBean;
import com.seoul.his.com.system.to.CodeNmBean;
import com.seoul.his.com.system.to.OutCodeBean;

@Component
public class CodeApplicationServiceImpl implements CodeApplicationService {

    @Autowired
    private CodeDAO codeDAO;

    @Override
    public List<CodeBean> findCodeList(Map<String, String> argsMap) {
        return codeDAO.selectCodeList(argsMap);
    }

    @Override
    public void batchCodeProcess(List<CodeBean> codeList) {
        for (CodeBean codeBean : codeList) {
            if (codeBean.getStatus().equals("inserted")) {
                codeDAO.insertCode(codeBean);
            } else if (codeBean.getStatus().equals("updated")) {
                codeDAO.updateCode(codeBean);
            } else if (codeBean.getStatus().equals("deleted")) {
                codeDAO.deleteCode(codeBean);
            }
        }
    }

    @Override
    public List<CodeNmBean> findCodePopupList(Map<String, String> argsMap) {
        return codeDAO.selectCodePopupList(argsMap);
    }

    @Override
    public List<CodeNmBean> findCode(Map<String, String> argsMap) {
        return codeDAO.selectCode(argsMap);
    }
    
    @Override
    public Map<String, List<OutCodeBean>> bindCode(List<BindCodeBean> bindCodeList) {
        Map<String, List<OutCodeBean>> bindCodeMap = new HashMap<String, List<OutCodeBean>>();
        for (BindCodeBean bcbean : bindCodeList) {
            bindCodeMap.put(bcbean.getDsName(), codeDAO.selectCodeBindList(bcbean.getCode()));
        }
        return bindCodeMap;
    }

}
