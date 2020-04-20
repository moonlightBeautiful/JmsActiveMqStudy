package com.ims.service.impl;


import com.ims.dao.StudentDao;
import com.ims.model.Student;
import com.ims.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 学生信息Service实现类
 *
 * @author Administrator
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public void add(Student student) {
        studentDao.save(student);
    }

}
