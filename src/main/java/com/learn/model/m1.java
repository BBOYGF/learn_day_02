package com.learn.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 1、定义切面
 * 2、加上两个注解@Aspect
 */
@Aspect
@Component
public class m1 {
    /**
     * 寻找规则
     * (1)任意公共方法的执行executiom(public **())
     * (2)任意一个以“set”开始的方法的执行：execution（*set()*）
     * (3)service的任意方法的执行：execution(*com.abc.service.*())
     */
    @Pointcut("execution(* com.codingstudy.demo.service..*(..))")
    public  void pointcut()
    {
        System.out.println("我是方法！！！");
    }
    @Before("pointcut()")
    public void before()
    {
        System.out.println("before执行到了AOP。。。");
    }
}
