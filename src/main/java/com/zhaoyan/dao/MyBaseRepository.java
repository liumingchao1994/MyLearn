package com.zhaoyan.dao;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.Optional;

@NoRepositoryBean
public interface MyBaseRepository<T, ID> extends Repository<T, ID> {

    <S extends T> S save(S var1);

    Optional<T> findById(ID var1);

    boolean existsById(ID var1);

    Iterable<T> findAll();

    long count();
}
