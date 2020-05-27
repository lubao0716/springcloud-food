package com.southwind.repository;

import com.southwind.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserRepository {
    public User login(String username, String password);
}
