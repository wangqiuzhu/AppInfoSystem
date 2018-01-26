package cn.appsys.service.dev_User;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.dev_User.UserMapper;
import cn.appsys.pojo.dev_User;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public dev_User deng(String devCode, String devPassword) {
		// TODO Auto-generated method stub
		return userMapper.deng(devCode, devPassword);
	}
	
}
