package com.seoul.his.acc.resol.to;



import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.acc.resol.to
 *    |_ PayRecBean.java
 * </pre>
 *
 * @date : 2016. 12. 13. 오후 8:41:07
 * @version :
 * @author : 응디꿍디
 */




@Setter
@Getter
@ToString
@Dataset(name = "dsPayRec")
public class PayRecBean extends BaseBean {
    private String  seq,
                    cardNo,
                    payDiv,
                    stdTask,
                    stdBimok,
                    cardUseDate,
                    aprvNo,
                    custCd,
                    operNo,
                    addr,
                    depoOwner,
                    transDate,
                    transBank,
                    accountNo,
                    price,
                    att,
                    cttInwon,
                    users,
                    foodCostYb,
                    taxinvYb,
                    note,
                    accPrid,
                    resolNo,
                    slipNo,
                    exePurp;
}
