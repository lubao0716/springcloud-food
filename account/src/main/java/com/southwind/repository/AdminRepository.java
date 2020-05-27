package com.southwind.repository;

import com.southwind.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AdminRepository {
    public Admin login(String username, String password);
}
