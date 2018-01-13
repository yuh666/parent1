package org.laotie.activiti.dao;

import org.laotie.activiti.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author yuh
 * 2018/1/13.
 */
public interface UserDao extends JpaRepository<User,Long> , JpaSpecificationExecutor<User>{

    /**
     * 根据姓名查询
     * @param name
     * @return
     */
    User findByName(String name);
}
