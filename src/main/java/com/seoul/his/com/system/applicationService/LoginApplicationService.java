package com.seoul.his.com.system.applicationService;

import java.util.Map;

import com.seoul.his.com.system.exception.IdNotFoundException;
import com.seoul.his.com.system.exception.PwMissMatchException;

public interface LoginApplicationService {
    public Map<String, Object> login(Map<String, String> argsMap)
            throws IdNotFoundException, PwMissMatchException;
}
