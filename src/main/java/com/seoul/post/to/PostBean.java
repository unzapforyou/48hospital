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
public class PostBean extends BaseBean {

    private String zipCode,     // 우편번호
                   baseAddr;    // 기본주소
    //테스트 태스트 브랜치 테스트
    // gggg
}
