package com.seoul.his.com.system.exception;

/**
 * @Package com.seoul.his.com.base.exception
 * @Class IdNotFoundException.java
 * @Create 2016. 5. 26.
 * @Author godseop
 * @Description 패스워드틀림 - Check Exception
 *
 * @LastUpdated
 */
@SuppressWarnings("serial")
public class PwMissMatchException extends Exception {

    public PwMissMatchException(String msg) {
        super(msg);
    }

}
