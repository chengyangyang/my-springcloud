package ch.khwb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.khwb.entity.User;
import ch.khwb.entity.UserExample;
import ch.khwb.entity.UserExample.Criteria;
import ch.khwb.dao.RoleMapper;
import ch.khwb.dao.UserMapper;

/**
 * 用户的service层
 * @author ASUS
 *
 */
@Service
public class UserService {

	@Autowired
	UserMapper userMapper ;
	@Autowired
	RoleMapper roleMapper;
	
	
	
	/*页面登录的服务*/
	public boolean selectByUserNameAndUserpassword(String name,String password){
		UserExample UserExample = new UserExample() ;
		Criteria createCriteria = UserExample.createCriteria();
		createCriteria.andUNameEqualTo(name);
		createCriteria.andUPasswordEqualTo(password);
		List<User> selectByExample = userMapper.selectByExample(UserExample);			
		return selectByExample.isEmpty();
	}
	/*查询所有用户*/
	public List<User> selectUserAll(){		
		return userMapper.selectByExample(null);
	}

	/*根据用户名称查询用户拥有的角色信息*/
	public List<User> selectRoleByName(String name){		
		 return userMapper.selectRoleByUserName(name);		
	}
	
	/*通过角色名称查询权限*/
	public List<String> selectPermissionByName(String name){		
		return roleMapper.selectPermissionByRole(name);				
	}
		
	/*是shiro使用    通过用户名称查询出用户的所有信息*/
	public List<User> findUserByUserName(String name){
		UserExample UserExample = new UserExample() ;
		Criteria createCriteria = UserExample.createCriteria();
		createCriteria.andUNameEqualTo(name);
		return userMapper.selectByExample(UserExample);					
	}
}
