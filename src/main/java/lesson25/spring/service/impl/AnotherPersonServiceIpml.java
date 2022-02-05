package lesson25.spring.service.impl;

import lesson25.spring.service.PersonService;

public class AnotherPersonServiceIpml implements PersonService {
    @Override
    public void print() {
        System.out.println("New person service print");
    }
}
