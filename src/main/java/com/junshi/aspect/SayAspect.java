package com.junshi.aspect;

import com.junshi.annotation.Say;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class SayAspect {

    @Around("@annotation(com.junshi.annotation.Say)")
    public Object say(ProceedingJoinPoint pj) throws Throwable {
        Say annotationSay = getAnnotationSay(pj);
        System.out.println(annotationSay.value());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        Object object = pj.proceed();
        System.out.println("22222222222222");
        return object;
    }


    /**
     * 是否存在注解，如果存在就获取
     */
    private static Say getAnnotationSay(ProceedingJoinPoint joinPoint) throws Exception {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        if (method != null) {
            return method.getAnnotation(Say.class);
        }
        return null;
    }
}
