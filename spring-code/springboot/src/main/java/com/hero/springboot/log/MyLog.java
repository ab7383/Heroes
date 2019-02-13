package com.hero.springboot.log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * MyLog
 * 声明该方法是个切面方法
 */
@Component
@Aspect
public class MyLog {

    private Logger logger = LoggerFactory.getLogger(MyLog.class);

    //标注切点 
    //读作com.hero.springboot.controller包下所有类的所有方法的任何参数形式
    //executeService为代理类 AOP的本质为动态代理，这里executeService()就是代理类
    @Pointcut("execution(public * com.hero.springboot.controller.*.*(..))")
    public void executeService(){};

    @Before("executeService()")
    public void doBeforeLog ( JoinPoint joinPoint)
    {
        // //AOP代理类的信息  
        // joinPoint.getThis();  
        // //代理的目标对象  
        // joinPoint.getTarget();  
        //用的最多 通知的签名
        Signature signature = joinPoint.getSignature();  
        //代理的是哪一个方法  
        logger.info("正在执行方法"+signature.getName());  
        //AOP代理类的名字  
        logger.info("AOP代理类的名字"+signature.getDeclaringTypeName()); 
    }

    @AfterReturning("executeService()")
    public void doAfterLog(JoinPoint joinPoint)
    {
        Signature signature = joinPoint.getSignature();  
        logger.info("方法 "+ signature.getName() +" 执行完毕");  
    }

    @AfterThrowing(pointcut = "executeService()", throwing = "e")
    public void doFaterThrowing(JoinPoint joinPoint, Throwable e)
    {
        logger.warn(joinPoint.getSignature().getName()+" 方法发生异常");  
        logger.warn(e.getMessage());
    }
    
}