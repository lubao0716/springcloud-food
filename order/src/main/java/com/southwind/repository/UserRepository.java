package com.southwind.repository;

import com.southwind.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserRepository {
    public User findById(long id);
}
