package com.seoul.his.acc.closing.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name = "dsFinanStats")
public class FinanStatsBean extends BaseBean {
    String  artiCd,      //�׸��ڵ�
            artiNm,      //�׸��
            dangiAmt,    //���ݾ�
            dangiSum,    //����հ�
            jungiAmt,    //����ݾ�
            jungiSum,    //�����հ�
            level,       //����
            acntDiv;     //��������
}