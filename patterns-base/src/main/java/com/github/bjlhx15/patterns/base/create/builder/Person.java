package com.github.bjlhx15.patterns.base.create.builder;

public class Person {
    private String name;
    private Integer number;
    private String sex;
    private Integer age;
    private String school;

    public Person(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.number = builder.number;
        this.school = builder.school;
        this.sex = builder.sex;
    }

    //构建器，利用构建器作为参数来构建Student对象
    public  static class Builder {
        private String name;
        private Integer number;
        private String sex;
        private Integer age;
        private String school;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
