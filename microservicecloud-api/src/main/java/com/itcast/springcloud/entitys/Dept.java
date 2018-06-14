package com.itcast.springcloud.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author congzi
 * @Description: 部门实体
 * @create 2018-06-14
 * @Version 1.0
 * 使用lombok注解简化开发
 */

/**
 *   @NoArgsConstructor  空参
     @AllArgsConstructor 无参
     @Data               get set
     @Accessors(chain = true)  链式编程 dept.setDeptno(1L).setDb_source("db1");
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{

    private Long deptno;

    private String dname;
    /**
     * 指定该数据存储到哪个数据库,因为微服务架构一个服务对应一个数据库
     *      同一个信息,可以存储到不同的数据库
     */
    private String db_source;



}
