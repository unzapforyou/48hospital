package com.seoul.his.com.system.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.com.system.to.BindCodeBean;
import com.seoul.his.com.system.to.CodeBean;
import com.seoul.his.com.system.to.CodeNmBean;
import com.seoul.his.com.system.to.OutCodeBean;

public interface CodeApplicationService {
    public List<CodeBean> findCodeList(Map<String, String> argsMap);

    public void batchCodeProcess(List<CodeBean> codeList);

    public List<CodeNmBean> findCode(Map<String, String> argsMap);

    public List<CodeNmBean> findCodePopupList(Map<String, String> argsMap);
    
    public Map<String, List<OutCodeBean>> bindCode(List<BindCodeBean> bindCodeList);
}
