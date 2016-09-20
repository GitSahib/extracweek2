package edu.mum.volunteers.bootstrap;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import edu.mum.volunteers.models.User;
@Component
@Aspect
public class UserAdvisor {
	@Around("execution(* setPassword(String))")
	public void changePassword(ProceedingJoinPoint jp) throws Throwable
	{
		Object[] args 	= jp.getArgs();
		String   pass	= (String) args[0];
		pass = (User.hashPassword(pass.toCharArray(), new byte[2], 2, 64));
		System.out.println(String.format("AOP Processed {0}",pass));
		args[0] = pass;
		jp.proceed(args);
		
	}
}
