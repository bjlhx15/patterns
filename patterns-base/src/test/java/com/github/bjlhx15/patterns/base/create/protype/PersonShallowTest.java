package com.github.bjlhx15.patterns.base.create.protype;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class PersonShallowTest {

    @Test
    public void test() throws Exception {
        //原型A对象
        PersonShallow a = new PersonShallow();
        a.setName("李宏旭");
        a.setAge(1);
        a.setBirthday(new Date());
        System.out.println("a：" + a);
        System.out.println("*************克隆**************");

        //克隆B对象
        PersonShallow b = (PersonShallow) a.clone();
        System.out.println("b：" + b);
        System.out.println("***************比较***************");
        /*
         * 测试A==B?
         * 对任何的对象x，都有x.clone() !=x，即克隆对象与原对象不是同一个对象
         */
        System.out.print("比较：A==B?");
        System.out.println(a == b?"是一个对象":"不是一个对象");
        System.out.println("a.hashCode:"+a.hashCode());
        System.out.println("b.hashCode:"+b.hashCode());

        b.getBirthday().setTime(666666666666L);
        System.out.println("a Birthday为：" + a.getBirthday());
        System.out.println("b Birthday为：" + b.getBirthday());


        a.setName("李四");
        System.out.println("a name 为：" + a.getName());
        System.out.println("b name 为：" + b.getName());

        /*
         * 比较Date对象
         */
        System.out.print("比较：A.Date==B.Date?");
        System.out.println(a.getBirthday() == b.getBirthday()?"是一个对象":"不是一个");

    }
}