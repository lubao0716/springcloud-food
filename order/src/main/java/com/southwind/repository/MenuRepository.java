package com.southwind.repository;

import com.southwind.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MenuRepository {
    public Menu findById(long id);
}