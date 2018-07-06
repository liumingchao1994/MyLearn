package com.zhaoyan.dao;

import com.zhaoyan.bean.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectDao extends CrudRepository<Subject, Long> {
}
