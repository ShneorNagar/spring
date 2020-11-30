package app.entities;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class TracingAspect {
    @Before("@annotation(app.annotations.SampleAnnotation) || @target(app.annotations.SampleAnnotation)")
    public void logFunction(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() + " called at " + new Date());
    }
}
