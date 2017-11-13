package com.seoul.his.com.system.exception;


/**
 * @Package  com.seoul.his.com.base.exception
 * @Class    IdNotFoundException.java
 * @Create   2016. 5. 26.
 * @Author   godseop
 * @Description 아이디찾을수없음 - Check Exception
 *
 * @LastUpdated 
 */
@SuppressWarnings("serial")
public class IdNotFoundException extends Exception {
    public IdNotFoundException(String msg) {
        super(msg);
    }
}
