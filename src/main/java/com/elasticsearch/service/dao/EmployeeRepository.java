package com.elasticsearch.service.dao;

import com.elasticsearch.service.entity.Employee;
import org.springframework.stereotype.Service;

/**
 * 作者：邬宗钊
 * 日期：2019/6/24 16:12
 * 描述：
 */
@Service
public interface EmployeeRepository {

    Employee queryEmployeeById(String Id);

}
