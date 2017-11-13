package com.seoul.his.acc.closing.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Dataset(name = "dsClosAcnt")
public class ClosAcntBean extends BaseBean{
    String  artiCd      ,  //����׸��ڵ�
            creDebDiv   ,  //��������
            debAmt      ,  //�����ݾ�
            creAmt      ,  //�뺯�ݾ�
            acntCd      ,  //���������ڵ�
            accPrid     ,  //ȸ����
            acntNm      ,  //���������
            acntAbs     ,  //����
            closYb      ,  //��꿩��
            gipyoDate   ;  //��ǥ����
}
