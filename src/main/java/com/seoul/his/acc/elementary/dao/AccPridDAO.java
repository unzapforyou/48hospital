
package com.seoul.his.acc.elementary.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.elementary.to.AccPridBean;

/**
 * <pre>
 * com.seoul.his.acc.elementary.dao
 *    |_ ElementaryDAO.java
 *
 * </pre>
 * @date : 2016. 12. 13. 오후 5:09:27
 * @version :
 * @author : 응디꿍디
 */

public interface AccPridDAO {

	List<AccPridBean> selectAccPridList(Map<String, String> argsMap);

	void updateAccPridDline(AccPridBean accPrid);

	void callCarrfor(AccPridBean accPrid);

	void insertAccPrid(AccPridBean batchAccPridBean);

	void deleteAccPrid(AccPridBean batchAccPridBean);

	void updateAccPrid(AccPridBean batchAccPridBean);

	List<AccPridBean> selectAccPridList();

	AccPridBean selectAccPrid(Map<String, String> argsMap);



}




