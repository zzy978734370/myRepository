package com.hospital.mapper;

import java.util.List;
import java.util.Map;

import com.hospital.model.Role;
import com.hospital.model.User;

/**
 * @author ZhaoZhenyu
 *
 * @date 2019年9月8日
 *
 * @Desc:UserMapper
 */
public interface UserMapper {

	User userLogin(Map map);

	List<User> getUsers(Map map);

	List<Role> getRoleType();

	int insertUser(Map map);

	int insertUserRole(Map map);

	int getIdByMap(Map map);

}
