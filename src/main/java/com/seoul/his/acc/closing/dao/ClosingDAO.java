package com.seoul.his.acc.closing.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.closing.to.ClosAcntBean;
import com.seoul.his.acc.closing.to.ClosDataBean;

public interface ClosingDAO {

    List<ClosDataBean> selectClosDataList(Map<String, Object> argsMap);

    List<ClosAcntBean> selectClosAcntList(Map<String, String> argsMap);

}
