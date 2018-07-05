package com.zhaoyan.dao;

import com.zhaoyan.bean.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersDao extends JpaRepository<Users, Integer> {

    @Query(value = " select  name from Users where pwd = ?1 ")
    List<Users> xxxxxxx(String pwd);
}
