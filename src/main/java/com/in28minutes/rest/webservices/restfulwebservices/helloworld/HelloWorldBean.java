package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
    String message;
    public HelloWorldBean(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // this is quite important, without this one, object cannot be returned
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }



}
