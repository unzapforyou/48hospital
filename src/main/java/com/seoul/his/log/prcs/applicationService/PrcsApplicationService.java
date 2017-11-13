package com.seoul.his.log.prcs.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.log.prcs.to.PrcsReceiptBean;
import com.seoul.his.log.demd.to.GdsAnspBean;
import com.seoul.his.log.demd.to.GdsAnspHistBean;

public interface PrcsApplicationService {
    List<GdsAnspBean> findAnspList(Map<String, String> argsMap);
    List<PrcsReceiptBean> findPrcsReceiptList(Map<String, String> argsMap);
    void batchPrcsReceiptProcess(List<PrcsReceiptBean> prcsReceiptList);
    List<GdsAnspHistBean> findAnspHistList(GdsAnspHistBean anspHistBean);
}
