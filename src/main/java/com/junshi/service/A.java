package com.junshi.service;

import com.junshi.annotation.Say;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    @Autowired
    private B b;

    public void setB(B b) {
        this.b = b;
    }

    @Say("hello")
    public void say() {
        this.b.say();
    }
}
