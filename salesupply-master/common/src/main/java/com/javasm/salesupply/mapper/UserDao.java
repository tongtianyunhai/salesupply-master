package com.javasm.salesupply.mapper;


import com.javasm.salesupply.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {


    User selectUserById(@Param("username") String username);

}