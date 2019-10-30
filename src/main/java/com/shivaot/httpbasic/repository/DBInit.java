package com.shivaot.httpbasic.repository;

import com.shivaot.httpbasic.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DBInit implements CommandLineRunner {

    private UserRepository userRepository;

    public DBInit(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User shiva = new User("shiva","shiva123","USER","");
        User admin = new User("admin","admin123","ADMIN","ACCESS_TEST1,ACCESS_TEST2");
        User manager = new User("manager","manager123","MANAGER","ACCESS_TEST1");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(shiva);
        users.add(manager);
        this.userRepository.saveAll(users);
    }
}
