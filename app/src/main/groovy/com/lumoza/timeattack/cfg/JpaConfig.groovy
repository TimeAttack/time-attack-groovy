package com.lumoza.timeattack.cfg

import org.springframework.boot.orm.jpa.EntityScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

/**
 * @author Maksim Zakharov
 * @since 1.0
 */
@EnableTransactionManagement
@EntityScan("com.lumoza.timeattack.entity")
@EnableJpaRepositories("com.lumoza.timeattack.repository")
class JpaConfig {

}
