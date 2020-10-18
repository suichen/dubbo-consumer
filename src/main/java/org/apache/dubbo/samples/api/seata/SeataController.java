package org.apache.dubbo.samples.api.seata;

import org.apache.dubbo.samples.api.TestServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;


@RestController
public class SeataController {
    @Autowired
    private TccTransactionService tccTransactionService;


    @RequestMapping("/seata/tcc")
    public void test() {
        tccTransactionService.doTransactionCommit();
    }
}
