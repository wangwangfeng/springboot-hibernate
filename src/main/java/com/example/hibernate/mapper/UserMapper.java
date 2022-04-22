package com.example.hibernate.mapper;

import com.example.hibernate.entity.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface UserMapper extends CrudRepository<User, Integer>, JpaSpecificationExecutor<User> {

}
