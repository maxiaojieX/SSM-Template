package com.ma.service.impl;

import com.ma.entity.Students;
import com.ma.mapper.StudentsMapper;
import com.ma.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public Students findById(Integer id) {
        return  studentsMapper.selectByPrimaryKey(id);
    }
}
