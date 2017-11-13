package com.seoul.his.com.system.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexacro.xapi.data.PlatformData;
import com.seoul.his.com.system.exception.IdNotFoundException;
import com.seoul.his.com.system.exception.PwMissMatchException;
import com.seoul.his.com.system.service.ComBaseServiceFacade;
import com.seoul.his.common.util.DataSetBeanMapper;
import com.seoul.his.hrs.emp.to.EmpBean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package  com.seoul.his.com.base.controller
 * @Class    LoginController.java
 * @Create   2016. 5. 26.
 * @Author   godseop
 * @Description 로그인 컨트롤러
 *      TODO : login 메서드 강제형변환 코드 수정할것
 * @LastUpdated
 */

@RestController
public class SocketController {

    @Autowired
    private ComBaseServiceFacade comBaseServiceFacade;

    @RequestMapping("/chat")
    public String viewChattingPage() {
        return "chatting/chat";
    }
     
    @RequestMapping("/paint")
    public String viewPaintingPage() {
        return "chatting/paint";
    }
       
}
