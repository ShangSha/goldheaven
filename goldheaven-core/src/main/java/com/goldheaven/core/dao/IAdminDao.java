/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 下午6:06:34 
 * ***************************************************************
 * </p>
 */
 
package com.goldheaven.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.goldheaven.core.entity.AdminInfo;

/** 
 * <p>
 * ************************************************************** 
 * @Description: TODO(系统管理员数据持久层) 
 * @AUTHOR zhenqiang.li@xiu.com
 * @DATE 2014-7-9 下午6:06:34 
 * ***************************************************************
 * </p>
 */
@Repository
public interface IAdminDao {

	/**
	 * 通过用户名和密码获取用户
	 * @param userName
	 * @param passWord
	 */
	AdminInfo getUserByNameAndPW(@Param("userName")String userName, @Param("passWord")String passWord);
	
	/**
	 * 获取管理员列表
	 * @return
	 */
	List<AdminInfo> getAdminList(@Param("fristRow")Integer fristRow, @Param("endRow")Integer endRow);
	
	/**
	 * 获取管理员总记录数
	 */
	Integer getAdminNum();
	
	/**
	 * 保存系统管理员
	 * @param admin
	 * @return
	 */
	Integer saveAdmin(AdminInfo admin);
	
	/**
	 * 通过ID删除用户
	 * @param id
	 * @return
	 */
	Integer deleteAdmin(Long id);
}
