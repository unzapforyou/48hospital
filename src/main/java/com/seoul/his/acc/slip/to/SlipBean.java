package com.seoul.his.acc.slip.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Dataset(name = "dsSlip")
public class SlipBean extends BaseBean{
    private String  slipNo      //��ǥ��ȣ
                    ,gipyoDate  //��ǥ����
                    ,slipDiv    //��ǥ����
                    ,ctrtNo     //����ȣ
                    ,custCd     //�ŷ�ó�ڵ�
                    ,operNo     //����ڹ�ȣ
                    ,abs        //����
                    ,demdDeptCd //�䱸�μ��ڵ�
                    ,resolDeptCd//���Ǻμ��ڵ�
                    ,regWorker  //�����
                    ,danDiv     //�ܱ���
                    ,prfYb      //��������
                    ,receiptNo  //������ȣ
                    ,sakNo      //���ι�ȣ
                    ,resolNo    //���ǹ�ȣ
                    ,closYb     //��꿩��
                    ,accPrid;    //ȸ����
}
