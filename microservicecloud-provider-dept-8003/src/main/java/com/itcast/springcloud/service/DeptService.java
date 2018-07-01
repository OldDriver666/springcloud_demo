package com.itcast.springcloud.service;

import com.itcast.springcloud.entitys.Dept;

import java.util.List;

/**
 * @author congzi
 * @Description:
 * @create 2018-06-14
 * @Version 1.0
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();

}
