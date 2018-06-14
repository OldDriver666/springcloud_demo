package com.itcast.springcloud.dao;

import com.itcast.springcloud.entitys.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author congzi
 * @Description:
 * @create 2018-06-14
 * @Version 1.0
 */
//SpringBoot 与 myBatis整合,需要使用这个@Mapper注解
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
