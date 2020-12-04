package com.github.bjlhx15.patterns.base.eg01create.eg03singleton;

public class HttpRequestFinal{
    private String id;
    private final Request request;
    public HttpRequestFinal(String id, String name, String age){
        this.id=id;
        this.request=new Request( name,  age);
    }
    static class Request{
        private String name;
        private String age;
        public Request(String name, String age){
            this.name=name;
            this.age=age;
        }
    }

    public static void main(String[] args) {
        HttpRequestFinal lhx = new HttpRequestFinal("200", "lhx", "18");

    }
}
