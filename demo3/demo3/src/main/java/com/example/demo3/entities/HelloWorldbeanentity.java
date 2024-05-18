package com.example.demo3.entities;

public class HelloWorldbeanentity {
    private String message;

    public HelloWorldbeanentity(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    @Override
    public String toString() {
        return "HelloWorldbeanentity{" +
                "message='" + message + '\'' +
                '}';
    }
    public void setMessage(String message) {
        this.message = message;
    }


}
