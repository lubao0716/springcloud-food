package com.southwind.repository;

import com.southwind.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TypeRepository {
    public Type findById(long id);
}
