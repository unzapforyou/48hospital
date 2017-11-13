package com.seoul.his.acc.resol.to;



import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.acc.resol.to
 *    |_ AutoJourRuleBean.java
 * </pre>
 *
 * @date : 2016. 12. 13. 오후 8:41:46
 * @version :
 * @author : 응디꿍디
 */




@Setter
@Getter
@ToString
@Dataset(name = "dsAutoJourRule")
public class AutoJourRuleBean extends BaseBean{
    private String  accYear     ,
            busiDivCd    ,
            jourDivNm    ,
            creDebDiv    ,
            acntCd       ,
            assiSubCd  ,
            note         ,
            jourCd       ,
            parentJourCd ,
            acntCdNm     ,
            assiSubCdNm  ,
            bimokCd		 ;
}
