package com.seoul.his.com.system.exception;

/**
 * @Package com.seoul.his.com.base.exception
 * @Class IdNotFoundException.java
 * @Create 2016. 5. 26.
 * @Author godseop
 * @Description 권한메뉴없음 - Check Exception
 *
 * @LastUpdated
 */
@SuppressWarnings("serial")
public class AuthMenuNotFoundException extends Exception {

    public AuthMenuNotFoundException(String msg) {
        super(msg);
    }

}
