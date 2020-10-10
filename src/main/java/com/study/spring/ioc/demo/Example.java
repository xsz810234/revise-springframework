package com.study.spring.ioc.demo;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaaa", "bbbb", "cccc");

        //静态方法语法	ClassName::methodName
        list.forEach(new Example()::print);
    }

    public void print(String aaa) {
        System.out.println(aaa);
    }

}
