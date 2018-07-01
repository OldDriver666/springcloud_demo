package com.itcast.springcloud.service.impl;

import com.itcast.springcloud.dao.DeptDao;
import com.itcast.springcloud.entitys.Dept;
import com.itcast.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author congzi
 * @Description:
 * @create 2018-06-14
 * @Version 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}
