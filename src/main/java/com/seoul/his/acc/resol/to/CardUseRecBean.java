package com.seoul.his.acc.resol.to;


import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.acc.resol.to
 *    |_ CardUseRecBean.java
 * </pre>
 *
 * @date : 2016. 12. 13. 오후 8:41:38
 * @version :
 * @author : 응디꿍디
 */




@Setter
@Getter
@ToString
@Dataset(name = "dsCardUseRec")
public class CardUseRecBean extends BaseBean{
    private String  cardNo          ,
                    cardKnd         ,
                    aprvNo          ,
                    anspAmt         ,
                    signDate        ,
                    custCd          ,
                    custNm          ,
                    operNo          ,
                    addr             ,
                    signAccntNo    ,
                    signBank        ,
                    accountHolder   ,
                    splyPrice       ,
                    taxAmt          ,
                    danDiv          ,
                    cardDiv			,
                    empNo			;
}
