
package com.seoul.his.msv.pre.prescriptionmanagement.to;

import com.seoul.his.common.annotation.Dataset;
import com.seoul.his.common.to.BaseBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * com.seoul.his.msv.pre.prescriptionmanagement.to
 *    |_ PrescDtlBean.java
 *
 * </pre>
 * @date : 2016. 12. 6. 오전 10:25:15
 * @version :
 * @author : 백송은
 */

@Getter
@Setter
@ToString
@Dataset(name="dsPrescDtl")
public class PrescDtlBean extends BaseBean{

	private String prescNo, prescCd, inEmgYn, inPrnYn, exAntiYn, holdingYn, exMtrlYn, mtrlNm, mtrlBodyPart, exExamWishDate;
	private String inTimes, inInsurance, exSelectCareYn, clncStudyYn, patType, inRemark, irradiYn, mtAmount, tfPurpose, tfTrfuLoc;
	private String ast, tfBloodDonor, volume, inUnit, rbTakeWay, rbDays, prescDtlNm, prescType, exNightYn, inCapacity;
	private String inNumber, inMethod, exEmgYn, exPrnYn, exTimes, exInsurance, exRemark, hdEmgYn, hdReoperYn, hdNightYn;
	private String hdTimes, hdStarttime, hdInsurance, hdRemark, mtEmgYn, mtReoperYn, mtNightYn, mtStarttime, mtInsurance, mtMaterLoc;
	private String mtRemark, rbSelectCareIn, rbInsurance, rbRemark, tfEmgYn, tfAmount, tfTimes, tfStarttime, tfInsurance, tfRemark;





}





