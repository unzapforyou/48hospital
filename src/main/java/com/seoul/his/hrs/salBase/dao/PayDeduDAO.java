package com.seoul.his.hrs.salBase.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.seoul.his.hrs.salBase.to.PayDeduBean;
import com.seoul.his.hrs.salBase.to.PayDeduSectBean;

public interface PayDeduDAO {
    
    public List<PayDeduBean> findPayDeduList(Map<String, String> argsMap)
            throws DataAccessException;

    public void magam(PayDeduBean payDeduBean) throws DataAccessException;
    public void magamCancel(PayDeduBean payDeduBean) throws DataAccessException;

    public void insertPayDedu(PayDeduBean payDeduBean) throws DataAccessException;
    public void updatePayDedu(PayDeduBean payDeduBean) throws DataAccessException;
    public void deletePayDedu(PayDeduBean payDeduBean) throws DataAccessException;

    public void insertPayDeduSect(PayDeduSectBean payDeduSectBean) throws DataAccessException;
    public void updatePayDeduSect(PayDeduSectBean payDeduSectBean) throws DataAccessException;
    public void deletePayDeduSect(PayDeduSectBean payDeduSectBean) throws DataAccessException;

}
