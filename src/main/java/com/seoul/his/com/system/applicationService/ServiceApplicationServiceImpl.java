package com.seoul.his.com.system.applicationService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seoul.his.com.system.dao.LogDAO;
import com.seoul.his.com.system.dao.ServiceDAO;
import com.seoul.his.com.system.to.ServiceBean;

@Component
public class ServiceApplicationServiceImpl implements ServiceApplicationService {

    @Autowired
    private ServiceDAO serviceDAO;
    @Autowired
    private LogDAO logDAO;

    @Override
    public List<ServiceBean> findService(Map<String, String> argsMap) {
        return serviceDAO.selectService(argsMap);
    }

    @Override
    public void batchErrorProcess(List<ServiceBean> serviceList) {
        System.out.println("AS findCode -------- 저장잘됩니까");
        for (ServiceBean service : serviceList) {
            System.out.println("AS findCode -------- 저장잘됩니까");
            if (service.getStatus().equals("inserted")) {
                System.out.println("AS findCode -------- 저장잘됩니까");
                serviceDAO.insertError(service);
            }
        }
    }


	@Override
	public void insertLog(String id, String time) {
		 logDAO.insertLog(id,time);
	}
}
