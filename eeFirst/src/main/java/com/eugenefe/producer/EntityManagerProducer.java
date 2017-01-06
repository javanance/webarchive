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
package com.eugenefe.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.eugenefe.qualifiers.OraTakionEm;
import com.eugenefe.qualifiers.OraTakionExtendedEm;
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
@ApplicationScoped
public class EntityManagerProducer {

//    @Produces
//    @PersistenceContext(unitName="primary")
//    @DefaultEm
//    private EntityManager em;

   
    @Produces
    @PersistenceContext(unitName="secondary")
    @SecondEm   
    private EntityManager emRel;
    
    
    @Produces
//    @PersistenceContext(unitName="takion79", type = PersistenceContextType.EXTENDED)
    @PersistenceContext(unitName="takion79")
    @OraTakionEm   
    private EntityManager emTakion;
    
    @Produces
    @PersistenceContext(unitName="takion79", type = PersistenceContextType.EXTENDED)
    @OraTakionExtendedEm   
    private EntityManager emExtTakion;
    
   

}
