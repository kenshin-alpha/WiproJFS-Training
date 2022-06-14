package BookShop.JFSBookShop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class BookAOP {

	@Before(value = "execution(public void show())")
	public void beforeShow(JoinPoint joinPoint) {
		System.out.println("Log Info: " + joinPoint.getSignature());
		System.out.println("Log Info: " + joinPoint.getClass() + " " + joinPoint.getSignature().getName());
		System.out.println("Doesn't return any Value");
	}
	
	@After(value = "execution(public void show())")
	public void afterShow() {
		System.out.println("After Show");
	}
	
	@AfterReturning(value = "execution(public int display())",returning="a")
	public void afterReturningDisplay() {
		System.out.println("Value Returned Successfully from display method");
	}
	
//	
//	@Around(value = "execution(public void show())")
//	public void aroundshow() {
//		System.out.println("Around show");
//	}
//
//	@Pointcut("execution(*MyBook.*(..))")
//	public void selectAll() {
//		
//	}
//	@Around("selectAll()")
//	public void AroundSelectOnePointCut() {
//		System.out.println("Log info:.......");
//	}
}
