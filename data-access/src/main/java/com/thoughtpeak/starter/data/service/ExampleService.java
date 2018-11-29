package com.thoughtpeak.starter.data.service;

import com.thoughtpeak.starter.data.dao.ExampleUserDao;
import com.thoughtpeak.starter.data.model.AccountUserEntity;
import com.thoughtpeak.starter.model.ui.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ExampleService {

    @Autowired
    private ExampleUserDao pathwayDao;

    public Optional<User> getPathwayConfigById(long id) {

        Optional<AccountUserEntity> node = Optional.of(pathwayDao.findOne(id));
        if (node.isPresent()){
            return node.get().getJsonConfig();
        }else {
            return Optional.empty();
        }

    }
}
