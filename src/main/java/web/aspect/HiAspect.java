package web.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class HiAspect {
	public Object sayHi(ProceedingJoinPoint jointPoint) throws Throwable {
		System.out.println("minsik : before jointPoint");
		Signature sig = jointPoint.getSignature();
		System.out.println(sig.getName());
		System.out.println(sig.toLongString());
		Object[] paramArr = jointPoint.getArgs();
		for(Object param : paramArr) {
			System.out.println("minsik param : " + param.toString());
		}
		try {
			Object result = jointPoint.proceed();
			return result;
		} finally {
			System.out.println("minsik: after jointPoint");
			Signature sig2 = jointPoint.getSignature();
			System.out.println(sig2.getName());
			System.out.println(sig2.toLongString());
			Object[] paramArr2 = jointPoint.getArgs();
			for(Object param : paramArr2) {
				System.out.println("minsik param : " + param.toString());
			}
		}
	}
}
