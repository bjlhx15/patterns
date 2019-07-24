package com.github.bjlhx15.patterns.base.create.singleton.service;

import com.github.bjlhx15.patterns.base.create.singleton.Singleton011springattr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Singleton012springController {
    @Autowired
    private Singleton012springService service;

    private String add;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @RequestMapping("test")
    public String test(String id){
        if(id.equals("1")){
            setAdd("京东总部");
            service.methodSetName("李宏旭");
        }
        System.out.println("Controller 属性:"+getAdd());
        System.out.println("Controller hashcode:"+this.hashCode());


        String name = service.getName();
        System.out.println("Service 属性:"+name);

        return "OK";
    }
}
