package com.neoteric.construtorInj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service(value = "accountService")
public class AccountService {

    private  final AccountDetils accountDetils;

    public  AccountService(AccountDetils accountDetils){
        this.accountDetils=accountDetils;

    }


    public String sayHi() {
        return "Hello from Spring Bean! " + accountDetils.acountDetils();
    }


}
