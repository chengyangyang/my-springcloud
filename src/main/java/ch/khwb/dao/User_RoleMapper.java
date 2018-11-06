package ch.khwb.dao;
/**
 * 用户角色接口
 */

import java.util.List;

import ch.khwb.entity.User_Role;
import ch.khwb.entity.User_RoleExample;
import org.apache.ibatis.annotations.Param;

public interface User_RoleMapper {
    long countByExample(User_RoleExample example);

    int deleteByExample(User_RoleExample example);

    int deleteByPrimaryKey(Integer uRId);

    int insert(User_Role record);

    int insertSelective(User_Role record);

    List<User_Role> selectByExample(User_RoleExample example);

    User_Role selectByPrimaryKey(Integer uRId);

    int updateByExampleSelective(@Param("record") User_Role record, @Param("example") User_RoleExample example);

    int updateByExample(@Param("record") User_Role record, @Param("example") User_RoleExample example);

    int updateByPrimaryKeySelective(User_Role record);

    int updateByPrimaryKey(User_Role record);
}