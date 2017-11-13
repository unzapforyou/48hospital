
package com.seoul.his.acc.vat.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.vat.to.DetailTaxInvBean;
import com.seoul.his.acc.vat.to.TaxInvBean;

/**
 * <pre>
 * com.seoul.his.acc.vat.dao.sqlMap
 *    |_ TaxDAO.java
 *
 * </pre>
 * @date : 2016. 12. 16. 오후 12:26:10
 * @version :
 * @author : 응디꿍디
 */

public interface TaxInvDAO {

	List<TaxInvBean> selectTaxInvoiceList(Map<String, String> argsMap);
	List<DetailTaxInvBean> selectDetailTaxInvList(Map<String, String> argsMap);
	List<TaxInvBean> selectTaxInvList(Map<String, String> argsMap);
	void insertTaxInv(TaxInvBean taxInvBean);
	void updateTaxInv(TaxInvBean taxInvBean);
	void deleteDetailTaxInv(DetailTaxInvBean detailTaxInvBean);
	void insertDetailTaxInv(DetailTaxInvBean detailTaxInvBean);
	void updateDetailTaxInv(DetailTaxInvBean detailTaxInvBean);


}



