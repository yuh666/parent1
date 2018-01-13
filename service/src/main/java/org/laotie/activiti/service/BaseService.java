package org.laotie.activiti.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.Collection;
import java.util.List;

/**
 * baseService封装简单逻辑
 * @param <T>
 */
public interface BaseService<T> {

    /**
     * 查询所有，带条件查询
     * @param spec
     * @return
     */
	public List<T> find(Specification<T> spec);

    /**
     * 获取一条记录
     * @param id
     * @return
     */
	public T get(Long id);

    /**
     * 分页查询，将数据封装到一个page分页工具类对象
     * @param spec
     * @param pageable
     * @return
     */
	public Page<T> findPage(Specification<T> spec, Pageable pageable);

    /**
     * 新增和修改保存
     * @param entity
     * @throws Exception
     */
	public  void saveOrUpdate(T entity) throws Exception;


    /**
     * 批量新增和修改保存
     * @param entitys
     */
	public  void saveOrUpdateAll(Collection<T> entitys);

    /**
     * 单条删除，按id
     * @param id
     */
	//public  void deleteById( Long id);


    /**
     * 批量删除
     * @param ids
     */
	public  void delete(Long[] ids);
}