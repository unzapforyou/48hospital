package com.seoul.his.com.system.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.com.system.to.ServiceBean;

public interface ServiceApplicationService {
    public List<ServiceBean> findService(Map<String, String> argsMap);

    public void batchErrorProcess(List<ServiceBean> service);

	public void insertLog(String id, String time);
}
