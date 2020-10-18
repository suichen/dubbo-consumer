package org.apache.dubbo.samples.api.seata;

import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeataConfig {
    @Bean
    public GlobalTransactionScanner globalTransactionScanner() {
        return new GlobalTransactionScanner("tcc-sample","my_test_tx_group");
    }
}
