package com.zakharov.crypto.config;

import com.zakharov.crypto.entity.User;
import com.zakharov.crypto.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository){
        return args -> {
            log.info("Preloading " + userRepository.save(new User(1L,"Alex",23,"alexzakharov026@gmail.com")));
            log.info("Preloading " + userRepository.save(new User(2L,"Maria",23,"mariaspys@gmail.com")));
        };
    }
}
