package com.seoul.his.acc.elementary.dao;

import java.util.List;
import java.util.Map;

import com.seoul.his.acc.elementary.to.AccntNoBean;

public interface AccntNoDAO {
    List<AccntNoBean> selectAccntNoList(Map<String, String> queryMap);

    void insertAccntNo(AccntNoBean accntNoBean);

    void deleteAccntNo(AccntNoBean accntNoBean);

    void updateAccntNo(AccntNoBean accntNoBean);

    void callCopyAccntNo(AccntNoBean accntNoBean);

}
