
package com.seoul.his.acc.vat.service;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.vat.to.DetailTaxInvBean;
import com.seoul.his.acc.vat.to.TaxInvBean;
import com.seoul.his.acc.vat.to.VATDeclBean;

/**
 * <pre>
 * com.seoul.his.acc.vat.service
 *    |_ VatServiceFacade.java
 *
 * </pre>
 * @date : 2016. 12. 16. 오후 12:20:18
 * @version :
 * @author : 응디꿍디
 */

public interface VatServiceFacade {

  List<DetailTaxInvBean> searchTaxInvList(Map<String, String> argsMap);
  
	List<TaxInvBean> findTaxInvList(Map<String, String> argsMap);

	void batchTaxInvProcess(List<TaxInvBean> tempTaxInvList);
 
	List<VATDeclBean> findVATDeclList(Map<String, String> argsMap);



}




