package com.jmotto.logic.als.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Aspect
@Component
public class ServiceLogger {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    static Logger log = Logger.getLogger(ServiceLogger.class.getName());
    
    @Around("execution(* *(..)) && @annotation(com.jmotto.logic.als.util.LogThat)")
    public Object logMethods(ProceedingJoinPoint jp) throws Throwable {
        String methodName = jp.getSignature().getName();
        logMethodInvocationAndParameters(jp);

        long startTime = new Date().getTime();
        Object result = jp.proceed(jp.getArgs());
        long endTime = new Date().getTime();

        log.debug("\nExecution time: " + (endTime - startTime) + "ms");
        log.debug("<- " + methodName + " returns \n" + gson.toJson(result) + "\n");

        return result;
    }

    private void logMethodInvocationAndParameters(ProceedingJoinPoint jp) {
        String[] argNames = ((MethodSignature) jp.getSignature()).getParameterNames();
        Object[] values = jp.getArgs();
        Map<String, Object> params = new HashMap<>();
        if (argNames.length != 0) {
            for (int i = 0; i < argNames.length; i++) {
                params.put(argNames[i], values[i]);
            }
        }

        log.debug("-> method " + jp.getSignature().getName() + " invocation");
        if (!params.isEmpty()) log.debug(gson.toJson(params));
    }

}