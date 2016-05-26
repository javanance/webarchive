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

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.eugenefe.entities.OdsIsinMaster;
import com.eugenefe.qualifiers.DefaultEm;
import com.eugenefe.qualifiers.SecondEm;

//@ApplicationScoped
public class IsinRepository {

    @Inject 
//    @DefaultEm
    @SecondEm
    private EntityManager em;
    
    @Inject
    private	Logger logger;

    public OdsIsinMaster findById(Long id) {
        return em.find(OdsIsinMaster.class, id);
    }
    public OdsIsinMaster findByIsin(String isin) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<OdsIsinMaster> criteria = cb.createQuery(OdsIsinMaster.class);
        Root<OdsIsinMaster> isinMaster = criteria.from(OdsIsinMaster.class);
        criteria.select(isinMaster).where(cb.equal(isinMaster.get("isin"), isin));
        logger.info("aaa: {}");
        logger.info( em.toString());
        return em.createQuery(criteria).getSingleResult();
    }
    public OdsIsinMaster findByKrName(String mvName) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<OdsIsinMaster> criteria = cb.createQuery(OdsIsinMaster.class);
        Root<OdsIsinMaster> isin = criteria.from(OdsIsinMaster.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(member).where(cb.equal(member.get(Member_.name), email));
        criteria.select(isin).where(cb.equal(isin.get("mvName"), mvName));
        return em.createQuery(criteria).getSingleResult();
    }
}
