package cn.appsys.dao.dev_User;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.dev_User;

public interface UserMapper {
	//��½��֤
	public dev_User deng(@Param("devCode") String devCode,
			@Param("devPassword") String devPassword);
}
