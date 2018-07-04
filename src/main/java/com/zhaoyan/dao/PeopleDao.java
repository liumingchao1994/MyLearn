package com.zhaoyan.dao;

import com.zhaoyan.bean.People;
import org.springframework.data.repository.CrudRepository;

public interface PeopleDao extends CrudRepository<People, Integer> {


}
