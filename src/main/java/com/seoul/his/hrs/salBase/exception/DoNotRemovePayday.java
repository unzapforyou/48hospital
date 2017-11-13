package com.seoul.his.hrs.salBase.exception;

/**
 * @Package  com.seoul.his.hrs.salBase.exeption
 * @Class    DoNotRemovePayday.java
 * @Create   2016. 5. 26.
 * @Author   YUN
 * @Description 삭제할 수 없는 급상여지급연월일
 *
 * @LastUpdated 
 */

@SuppressWarnings("serial")
public class DoNotRemovePayday extends Exception {
    public DoNotRemovePayday(String arg0) {
        super(arg0);
    }
}
