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
package com.eugenefe.util;

import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import com.eugenefe.qualifiers.DefaultEm;
import com.eugenefe.qualifiers.SecondEm;

/**
 * This class uses CDI to alias Java EE resources, such as the persistence context, to CDI beans
 * 
 * <p>
 * Example injection on a managed bean field:
 * </p>
 * 
 * <pre>
 * &#064;Inject
 * private EntityManager em;
 * </pre>
 */
//@ApplicationScoped
public class EntityManagerProducer {

    
//    @PersistenceContext(unitName="primary")
//    private EntityManager em;
//
//   
//    @PersistenceContext(unitName="secondary")
//    private EntityManager emRel;
    
    @PersistenceUnit(unitName ="primary")
    private EntityManagerFactory emf;
    
    @PersistenceUnit(unitName="secondary")
    private EntityManagerFactory emfrel;
    
    @Produces   @DefaultEm  
    public EntityManager getDefaultEm() {  
       return emf.createEntityManager();
    }  
    
    @Produces   @SecondEm   
    public EntityManager getSecondEm() {  
      return emfrel.createEntityManager();
    }  
    

}
