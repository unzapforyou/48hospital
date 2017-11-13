package com.seoul.his.acc.slip.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.slip.dao.SlipDAO;
import com.seoul.his.acc.slip.to.SlipBean;

@Service
public class SlipApplicationServiceImpl implements SlipApplicationService{
    @Autowired
    SlipDAO slipDAO;

    @Override
    public void registerSlipList(List<SlipBean> slipBeanList) {
        Map<String, String> param=new HashMap<String, String>();
        for(SlipBean slipBean:slipBeanList){
            slipDAO.insertSlip(slipBean);

            String resolNo= slipBean.getResolNo();
            if(resolNo==null || resolNo==""){
                new RuntimeException("에러메시지!!");
            }
            param.put("resolNo", resolNo);
            param.put("errCd", "");
            param.put("errMsg", "");
            slipDAO.callSlipNoUpdate(param);
            String errCd=param.get("errCd");
            String errMsg=param.get("errMsg");
           if(errCd.equals("-1"))
                new RuntimeException(errMsg);
            param.clear();
        }
    }

    @Override
    public List<SlipBean> findSlipList(Map<String, String> argsMap) {
        return slipDAO.selectSlipList(argsMap);
    }

}
