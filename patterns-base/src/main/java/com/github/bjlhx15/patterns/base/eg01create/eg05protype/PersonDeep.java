package com.github.bjlhx15.patterns.base.eg01create.eg05protype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonDeep implements Cloneable {
    private String name;
    private Date birthday;
    private List<String> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PersonDeep deep = null;
        try {
            deep = (PersonDeep) super.clone();
            // 需要特殊处理引用类型的变量
            deep.birthday = (Date) deep.birthday.clone();
            List<String> newList = new ArrayList();
            if(this.list!=null)
            for (String str : this.list) {
                newList.add(str);
            }
            deep.setList(newList);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deep;
    }


    @Override
    public String toString() {
        return "PersonDeep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", list=" + list +
                '}';
    }
}
