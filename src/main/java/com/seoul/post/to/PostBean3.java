package com.seoul.post.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name="dsPost")
public class PostBean3 extends BaseBean {

    private String zipCode,     // 우편번호
                   baseAddr,
  
     baseAddr2,baseAddr45, baseAddr34;
  }
