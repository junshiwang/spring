package com.junshi.service;

import com.junshi.annotation.Say;
import com.junshi.service.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

    @Autowired
    private A a;

    public void setA(A a) {
        this.a = a;
    }

    public void say() {
        System.out.println("B say");
    }
}
