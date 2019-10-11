package com.hospital.mapper;

import java.util.List;
import java.util.Map;

public interface RoleMapper {

	List getList(Map map);

	int insertRole(Map map);

	int getRoleId(Map map);

	int insertPermission(Map map);
	
}
