package com.seoul.his.acc.resol.to;


import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.acc.resol.to
 *    |_ AppendFileBean.java
 * </pre>
 *
 * @date : 2016. 12. 13. 오후 8:41:59
 * @version :
 * @author : 응디꿍디
 */




@Setter
@Getter
@ToString
@Dataset(name = "dsAppendFile")
public class AppendFileBean extends BaseBean{
    String  seq          ,
            fileSaveLoc  ,
            fileSize     ,
            fileSaveName ,
            resolNo      ,
            slipNo       ;
}
