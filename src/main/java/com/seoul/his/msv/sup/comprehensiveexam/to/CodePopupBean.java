package com.seoul.his.msv.sup.comprehensiveexam.to;



import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package  com.seoul.his.msv.sup.comprehensiveexam.to
 * @Class    CodePopupBean.java
 * @Create   2016. 12. 01.
 * @Author   박상우
 * @Description   코드팝업 Bean
 *
 * @LastUpdated   2016. 12. 01.
 */

@Getter
@Setter
@ToString
@Dataset(name = "dsCodePopup")
public class CodePopupBean extends BaseBean {
    private String
                code,        // 코드
                codeName;    // 코드명
}
