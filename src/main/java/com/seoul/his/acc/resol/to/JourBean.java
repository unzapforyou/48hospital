package com.seoul.his.acc.resol.to;


import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.acc.resol.to
 *    |_ JourBean.java
 * </pre>
 *
 * @date : 2016. 12. 13. 오후 8:41:28
 * @version :
 * @author : 응디꿍디
 */




@Setter
@Getter
@ToString
@Dataset(name = "dsJour")
public class JourBean extends BaseBean{
    private String  seq      ,
                    creDebDiv,
                    debAmt   ,
                    creAmt   ,
                    taxDiv   ,
                    acntCd   ,
                    assiSubCd,
                    accPrid  ,
                    resolNo  ,
                    slipNo   ,
                    acntNm   ,
                    assiSubNm,
                    bimokCd  ,
                    closYb	 ;
}
