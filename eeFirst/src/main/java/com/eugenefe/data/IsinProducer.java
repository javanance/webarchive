/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.eugenefe.data;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eugenefe.entities.OdsIsinMaster;
import com.eugenefe.qualifiers.DefaultEm;
import com.eugenefe.qualifiers.SecondEm;

@RequestScoped
public class IsinProducer {
	private static Logger logger = LoggerFactory.getLogger("IsniProducer");

    @Inject
    private IsinRepository isinRepository;
    
    @Inject @DefaultEm
    private EntityManager em;

    private OdsIsinMaster isinMaster;
    
    @Resource
    private UserTransaction userTransaction;

    @Produces
    @Named
    public OdsIsinMaster getIsin() {
    	OdsIsinMaster temp = new OdsIsinMaster();
    	temp.setIsin("ss");
//    	try {
//    		em.getTransaction().begin();
//    		em.merge(temp);
//    		logger.info("bbb : {}", em.contains(isinMaster));
//    		logger.info("yyy : {}", em.contains(isinMaster));
//    		em.flush();
//    		em.getTransaction().commit();
//    		em.close();
//			
//		} catch (Exception e) {
//			logger.info("ccc : {}", em.contains(isinMaster));
//		}
//    	try {
//    		
//    		userTransaction.begin();
//    		logger.info("bbb : {}", em.contains(isinMaster));
//    		em.merge(temp);
//    		em.flush();
//    		logger.info("yyy : {}", em.contains(isinMaster));
//    		userTransaction.commit();
//			
//		} catch (Exception e) {
//			logger.info("ccc : {}", em.contains(isinMaster));
//		}
        return isinMaster;
    }

  

    @PostConstruct
    public void retrieveAllIsin() {
    	isinMaster = isinRepository.findByIsin("KR4201NC2702");
    	logger.info("xxx : {}", isinMaster.getIsin());
    	
    }
}
