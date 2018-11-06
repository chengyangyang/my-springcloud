package ch.khwb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.khwb.entity.Role_Permission;
import ch.khwb.entity.Role_PermissionExample;
import ch.khwb.entity.Role_PermissionExample.Criteria;
import ch.khwb.dao.Role_PermissionMapper;
/**
 * 角色权限service层
 * @author ASUS
 *
 */

@Service
public class RolePermissionService {

	@Autowired
	Role_PermissionMapper role_PermissionMapper;
	
	
	/*新添角色权限*/
	public void addRolePermission(Role_Permission rp){
		role_PermissionMapper.insert(rp);
	}
	
	/*删除角色权限*/
	public void deleteRolePermission(Integer rid,Integer pid){
		Role_PermissionExample example = new Role_PermissionExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andRIdEqualTo(rid);
		createCriteria.andPIdEqualTo(pid);
		role_PermissionMapper.deleteByExample(example);
	}
	 
	/*根据权限id删除角色权限表*/
	public void deleteRolePermissionByPermissionId(Integer pid){
		Role_PermissionExample example = new Role_PermissionExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andPIdEqualTo(pid);
		role_PermissionMapper.deleteByExample(example);	
	}
	
	//根据角色id删除角色权限中
	public void deleteRolePermissionByRoleId(Integer rid){
		Role_PermissionExample example = new Role_PermissionExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andRIdEqualTo(rid);
		role_PermissionMapper.deleteByExample(example);
	}	
}
