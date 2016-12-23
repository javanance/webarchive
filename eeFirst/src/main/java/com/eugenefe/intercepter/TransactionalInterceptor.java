package com.eugenefe.intercepter;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.eugenefe.qualifiers.MyTransactional;
import com.eugenefe.qualifiers.OraTakionEm;

@Interceptor
@MyTransactional
public class TransactionalInterceptor {
	@Inject @OraTakionEm
	private EntityManager em;

	@AroundInvoke
	 public Object invoke(InvocationContext context) throws Exception{
	   EntityTransaction t =em.getTransaction();
	   try {
	     if(!t.isActive()) 
	       t.begin();    
	     return context.proceed();
	   } catch(Exception e) {
		   t.rollback();
	   } finally {
	     if(t != null && t.isActive()) 
	       t.commit();
	     return context.proceed();
	   }
	 }
}
