package com.kg.customlogging;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Aspect
@Component

public class Logger 
{
   private static org.slf4j.Logger logger = LoggerFactory.getLogger(Logger.class);
     @Around("@annotation(com.kg.customlogging.MethodStats)")
   public void around(ProceedingJoinPoint joinPoint) throws Throwable {
     long startTime = System.currentTimeMillis();
 
     joinPoint.proceed();
 
     long timeTaken = System.currentTimeMillis() - startTime;
     logger.info("Time Taken by {} is {}", joinPoint, timeTaken);
   }
}