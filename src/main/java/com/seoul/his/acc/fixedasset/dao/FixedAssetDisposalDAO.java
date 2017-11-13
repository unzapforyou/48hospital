package com.seoul.his.acc.fixedasset.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.fixedasset.to.DisposalPlnFixedAssetBean;
import com.seoul.his.acc.fixedasset.to.DisposalRegBean;
import com.seoul.his.acc.fixedasset.to.DisposalSellValueBean;
import com.seoul.his.acc.fixedasset.to.FixedAssetSequenceBean;


/**
 * @Package  com.seoul.his.acc.fixedasset.dao
 * @Class    FixedAssetDisposalDAO.java
 * @Create   2016. 6. 8.
 * @Author   jeong
 * @Description
 *
 * @LastUpdated 
 */
public interface FixedAssetDisposalDAO {
	public List<FixedAssetSequenceBean> selectDisposalPlnFixedAssetNo();
	public List<DisposalPlnFixedAssetBean> selectDisposalPlnFixedAssetList(Map<String, String> argsMap);
	public void insertDisposalPlnFixedAsset(DisposalPlnFixedAssetBean disposalPlnFixedAssetBean);
	public void deleteDisposalPlnFixedAsset(DisposalPlnFixedAssetBean disposalPlnFixedAssetBean);
	public void updateDisposalPlnFixedAsset(DisposalPlnFixedAssetBean disposalPlnFixedAssetBean);
	
	public List<DisposalRegBean> selectDisposalFixedAssetList(Map<String, String> argsMap);
	
	public void callDisposalSellValue(DisposalSellValueBean inDisposalSellValueBean);
	public void insertDisposalFixedAsset(DisposalRegBean disposalRegBean);
	public void deleteDisposalFixedAsset(DisposalRegBean disposalRegBean);
	public void updateDisposalFixedAsset(DisposalRegBean disposalRegBean);
	
}







