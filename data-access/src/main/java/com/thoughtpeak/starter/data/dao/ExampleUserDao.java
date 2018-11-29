package com.thoughtpeak.starter.data.dao;


import com.thoughtpeak.starter.data.model.AccountUserEntity;
import org.springframework.data.repository.CrudRepository;

public interface ExampleUserDao extends CrudRepository<AccountUserEntity, Long> {

    //@Query("select firstName, lastName from User u where u.emailAddress = :email")
    //AccountUserEntity findById(@Param("email") long id);
}
