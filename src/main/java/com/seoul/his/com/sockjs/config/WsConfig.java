package com.seoul.his.com.sockjs.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.seoul.his.com.sockjs.ws.EchoHandler;

@Configuration
@EnableWebSocket
@ComponentScan(basePackages = {
        "com.seoul.his.com.sockjs.*"
})
public class WsConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer {
	
	  @Autowired
	    private EchoHandler echoHandler;
	  
	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		System.out.println("ccc");
		registry.addHandler(echoHandler(), "/echo.sockjs").withSockJS();

	}

	@Bean
	public EchoHandler echoHandler() {
		System.out.println("ddd");
		return new EchoHandler();
	}
	


}
