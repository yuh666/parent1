package org.laotie.activiti.service;

import org.laotie.activiti.entity.User;

/**
 * @author yuh
 * 2018/1/13.
 */
public interface UserService extends BaseService<User> {

    /**
     * 根据名字查询
     * @param name
     * @return
     */
    User findByName(String name);
}
