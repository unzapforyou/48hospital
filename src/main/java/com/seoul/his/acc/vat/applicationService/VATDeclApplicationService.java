package com.seoul.his.acc.vat.applicationService;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.vat.to.VATDeclBean;

public interface VATDeclApplicationService {

    List<VATDeclBean> findVATDeclList(Map<String, String> argsMap);

}
