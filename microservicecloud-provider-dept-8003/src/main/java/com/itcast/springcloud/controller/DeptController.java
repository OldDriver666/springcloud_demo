package com.itcast.springcloud.controller;

import com.itcast.springcloud.entitys.Dept;
import com.itcast.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author congzi
 * @Description: 部门Conroller 支持restful风格访问
 * @create 2018-06-14
 * @Version 1.0
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;


    @Autowired
    private DiscoveryClient discoveryClient;


    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return  deptService.add(dept);
    }


    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept add(@PathVariable("id") Long id){
        return  deptService.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list()
    {
        return deptService.list();
    }




}
