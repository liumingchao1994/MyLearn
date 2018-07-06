package com.zhaoyan.dao;

import com.zhaoyan.bean.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryDao extends CrudRepository<Category, Long> {


    //    public List<Category> findBySubject(Long id);
//    public List<Category> findBySubject_Id(Long id);
}

