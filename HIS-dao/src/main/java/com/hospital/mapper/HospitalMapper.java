package com.hospital.mapper;

import java.util.List;
import java.util.Map;

import com.hospital.model.CertificateType;
import com.hospital.model.ChargeManager;
import com.hospital.model.Doctor;
import com.hospital.model.Drug;
import com.hospital.model.HospitalInfor;
import com.hospital.model.PayItems;
import com.hospital.model.RegistrationInfor;
import com.hospital.model.Section;

public interface HospitalMapper {

	List<RegistrationInfor> hospitalList(Map map);

	int listCount(Map map);

	RegistrationInfor hospitalDetail(String medicalRecord);

	List<Doctor> getDoctor();

	List<Section> getSection();

	List<CertificateType> getcertificate();

	int hospitalUpdate(RegistrationInfor registrationInfo);

	int hospitalUpdate1(HospitalInfor hospitalInfor);

	int outAll(List list);

	int goAll(List list);

	int hospitalAddOne(RegistrationInfor registrationInfo);

	int hospitalAddTwo(HospitalInfor hospitalInfor);

	RegistrationInfor getInfo(String medicalRecord);

	List<RegistrationInfor> getChargeList(Map map);

	List<PayItems> getChargeItems();

	int chargeAdd(ChargeManager chargeManager);

	int registrationInfor(String medicalRecord);

	int deletehospitalInfo(List list);

	int deletehospitalInfo2(List list);

	List<RegistrationInfor> dispensingList(Map map);

	List<Drug> getDrugType();

	int getDrugNum(Map map);

	int setDrugSurplus(Map map);

	int setdispensing(Map map);

	List<RegistrationInfor> getChecks(List check);

	int setDrugSurplusAll(Map map);

	int setdispensingAll(Map map);

}
