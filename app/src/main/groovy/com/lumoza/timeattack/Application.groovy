package com.lumoza.timeattack

import com.lumoza.timeattack.cfg.Config
import org.springframework.boot.SpringApplication

/**
 * @author Maksim Zakharov
 * @since 1.0
 */
class Application {

    public static void main(String... args) {
        SpringApplication.run(Config, args)
    }
}
