package com.github.bjlhx15.patterns.base.create.singleton.service;


import org.springframework.stereotype.Service;

@Service
public class Singleton012springService {
    public Singleton012springService() {
        System.out.println("ctor Singleton012springService");
    }

    public void init() {
        System.out.println("init Singleton012springService");
    }

    private String name;

    public String getName() {

        System.out.println("Service hashcode:"+this.hashCode());
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String methodSetName(String name){
        setName(name);
        return getName();
    }
}
