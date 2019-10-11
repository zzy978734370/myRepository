package com.hospital.mapper;

import java.util.List;
import java.util.Map;

import com.hospital.model.Doctor;

/**
 * @author ZhaoZhenyu
 *
 * @date 2019年9月8日
 *
 * @Desc:DoctorMapper
 */
public interface DoctorMapper {

	List<Doctor> doctorList(Map map);

	int doctorCount();

	int doctorCount(Map map);

	Doctor doctorLook(int id);

	int updateDoctorById(Doctor doctor);

	int doctorAdd(Doctor doctor);

}
