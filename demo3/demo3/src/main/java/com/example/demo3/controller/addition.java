package com.example.demo3.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
@RestController

public class addition {
    @GetMapping(path="/add")
    /*public int sum()
    {
        int a=3;
        int b=4;
        int s=a+b;

        return s;

    }*/
    public int add(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter second Number : ");
        int b = sc.nextInt();


        int sum = a+b;
        return sum;
    }

}
