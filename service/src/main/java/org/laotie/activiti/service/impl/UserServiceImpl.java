package org.laotie.activiti.service.impl;

import java.util.Collection;
import java.util.List;

import org.laotie.activiti.dao.UserDao;
import org.laotie.activiti.entity.User;
import org.laotie.activiti.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 *
 */
@Service("userService")
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	/**
	 * 条件查询
	 */
	@Override
	public List<User> find(Specification<User> spec) {
		return userDao.findAll(spec);
	}

	/**
	 * 根据id查询
	 */
	@Override
	public User get(Long id) {

		return userDao.getOne(id);
	}

	/**
	 * 分页查询
	 */
	@Override
	public Page<User> findPage(Specification<User> spec, Pageable pageable) {

		return userDao.findAll(spec, pageable);
	}

	/**
	 * 修改/保存
	 * @throws Exception 
	 */
	@Override
	public void saveOrUpdate(User entity) throws Exception {
	}

	/**
	 * 批量修改/保存
	 */
	@Override
	public void saveOrUpdateAll(Collection<User> entitys) {
	}

	/**
	 * 根据id删除
	 */
	/*@Override
	public void deleteById(Long id) {
		userDao.deleteById(id);
	}*/

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		
		for (Long id : ids) {
			 //deleteById(id);
		}
	}
	
	//自定义方法
	@Override
	public User findByName(String userName) {
		return userDao.findByName(userName);
	}

}
