package com.neoteric.construtorInj;

import com.neoteric.SpringDemo.SpringDemoConfug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class AccountTest {
//    public AccountService getAccountService() {
//        return accountService;
//    }

    private   AccountService accountService;


    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

//
//@Autowired
//public AccountTest(AccountService accountService){
//    this.accountService= accountService;
//}

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);

       AccountService accountService1 = ctx.getBean("accountService",AccountService.class);

      String service= accountService1.sayHi();

      AccountDetils accountDetils = new AccountDetils();
      String details = accountDetils.acountDetils();


      AccountTest test = new AccountTest();
      test.setAccountService(accountService1);

        System.out.println("test class"+test);

        System.out.println("A ccount service "+ service);
        System.out.println("account details"+ details);

    }
}
