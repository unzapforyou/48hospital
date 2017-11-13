package com.seoul.his.acc.closing.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name = "dsTotalBal")
public class TotalBalBean extends BaseBean {
    String  acntCd,      //���������ڵ�
            acntNm,      //��������
            debBal,      //�����ܾ�
            debSum,      //�����հ�
            creSum,      //�뺯�հ�
            creBal,
            level;      //�뺯�ܾ�
}