package com.ma.service;

import com.ma.entity.Students;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
public interface StudentsService {
    Students findById(Integer id);
}
