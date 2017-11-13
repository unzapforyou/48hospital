package com.seoul.his.acc.closing.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name = "dsClosData")
public class ClosDataBean extends BaseBean {
    String  artiCd           //����ڷ��׸��ڵ�
            ,artiNm            //�׸��
            ,amt               //�ݾ�
            ,sumAmt            //�հ�ݾ�
            ,jourAmt           //�а����ݾ�
            ,cellInputDiv       //���Է±��� I:�Է� P:�˾�
            ,autoCalYn         //�ڵ���꿩��
            ,sumArtiCd         //�ջ��׸��ڵ�
            ,deductYn
            ,level;         //��������
    
}