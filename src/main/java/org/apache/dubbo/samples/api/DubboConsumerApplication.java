package org.apache.dubbo.samples.api;


import io.seata.common.util.StringUtils;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.samples.api.seata.TccTransactionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

@EnableDubbo
@SpringBootApplication
public class DubboConsumerApplication {
    static TccTransactionService tccTransactionService;
    public static void main(String[] args) throws Exception{
        ApplicationContext context = SpringApplication.run(DubboConsumerApplication.class, args);
        tccTransactionService = (TccTransactionService)context.getBean("tccTransactionService");
        transactionCommitDemo();
    }

    private static void transactionCommitDemo() throws InterruptedException {
        String txId = tccTransactionService.doTransactionCommit();
        System.out.println(txId);
        Assert.isTrue(StringUtils.isNotBlank(txId), "事务开启失败");

        System.out.println("transaction commit demo finish.");
    }

}
