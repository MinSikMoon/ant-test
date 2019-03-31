package web.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class HiAspect {
	public Object sayHi(ProceedingJoinPoint jointPoint) throws Throwable {
		System.out.println("minsik : before jointPoint");
		try {
			Object result = jointPoint.proceed();
			return result;
		} finally {
			System.out.println("minsik: after jointPoint");
			System.out.println(jointPoint.getArgs());
			System.out.println(jointPoint.getKind());
		}
	}
}
