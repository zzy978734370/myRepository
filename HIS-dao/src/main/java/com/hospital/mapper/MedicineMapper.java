package com.hospital.mapper;

import java.util.List;
import java.util.Map;

import com.hospital.model.Drug;
import com.hospital.model.DrugType;

public interface MedicineMapper {

	List<Drug> medicineList(Map map);

	int medicineCount(Map map);

	List<DrugType> getDrugType();

	Drug medicineDetial(String id);

	int drugEdit(Drug drug);

	int medicineAdd(Drug drug);

}
