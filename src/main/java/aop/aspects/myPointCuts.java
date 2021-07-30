package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class myPointCuts {
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods(){}
}
