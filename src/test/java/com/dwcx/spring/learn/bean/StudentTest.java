package com.dwcx.spring.learn.bean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    public static void main(String[] args) {

        //创建对象和为属性赋值 可以交给spring完成
       /* Student student = new Student();
        student.setName("angle");
        */
        //1、创建spring的IOC容器对象
        ApplicationContext  ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2、从IOC容器中获取Bean 实例
        //Student student = (Student) ctx.getBean("student");

       //调用hello方法
        //student.hello();
    }
}
