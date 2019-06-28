package com.elasticsearch.service.controller;

import com.elasticsearch.service.dao.EmployeeRepository;
import com.elasticsearch.service.entity.Employee;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者：邬宗钊
 * 日期：2019/6/24 16:14
 * 描述：
 */
@RestController
@RequestMapping("/es/")
public class EmployeeController {

    /**
     * 添加
     * @return
     */
    @RequestMapping("add")
    public String add() {
        Employee employee = new Employee();
        employee.setId("1");
        employee.setFirstName("xuxu");
        employee.setLastName("zh");
        employee.setAge(26);
        employee.setAbout("i am in peking");
        System.err.println("add a obj");
        return "success";
    }

}
