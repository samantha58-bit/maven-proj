package com.example;

public class App {
    public String getMessage() {
        return "Hello from CI/CD Pipeline! Testing";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());
    }
}
