package com.zhaoyan.dao;

import com.zhaoyan.bean.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UsersDao extends JpaRepository<Users, Integer> {


}
