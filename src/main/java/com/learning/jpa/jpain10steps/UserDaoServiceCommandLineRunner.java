package com.learning.jpa.jpain10steps;

import com.learning.jpa.jpain10steps.Entity.User;
import com.learning.jpa.jpain10steps.Service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // at start up
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
    @Autowired
    private UserDAOService userDaoService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        long insert = userDaoService.insert(user);
        log.info("New User is created : " + user);
    }
}
