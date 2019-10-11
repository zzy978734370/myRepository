package com.hospital.mapper;

import java.util.List;
import java.util.Map;

import com.hospital.model.RegistrationInfor;

/**
 * @author ZhaoZhenyu
 *
 * @date 2019年9月8日
 *
 * @Desc:
 */
public interface RegistrationMapper {

	List<RegistrationInfor> registrationList(Map map);

	int getCount(Map map);

	RegistrationInfor registrationDetail(Map map);

	int registrationEditt(RegistrationInfor reInfor);

	int registrationDelete(String record);

	int registrationDeleteAll(List list);

	int registrationAdd(RegistrationInfor reInfor);

	int AddhospitalInfo(String medicalRecord);

	int deletehospitalInfor(String record);

	int deletehospitalInforAll(List list);


}
