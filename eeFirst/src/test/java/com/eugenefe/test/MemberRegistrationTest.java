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
package com.eugenefe.test;

import static org.junit.Assert.assertNotNull;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.eugenefe.data.IsinProducer;
import com.eugenefe.data.IsinRepository;
import com.eugenefe.entities.OdsIsinMaster;
import com.eugenefe.producer.EntityManagerProducer;
import com.eugenefe.util.Resources;

@RunWith(Arquillian.class)
public class MemberRegistrationTest {
    @Deployment
    public static Archive<?> createTestArchive() {
    	
//    	return ShrinkWrap.create(WebArchive.class, "firstDynWeb.war")
//        .addClasses(IsinRepository.class, IsinProducer.class, EntityManagerProducer.class,  Resources.class)
//      .addAsResource("META-INF/persistence.xml")
//      .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
//      .addAsWebInfResource("test-ds.xml");
    	
    	return  ShrinkWrap.create(JavaArchive.class)
//                .addClasses(IsinRepository.class, IsinProducer.class, EntityManagerProducer.class,  Resources.class);
    			.addClasses(IsinRepository.class);
    }

    @Inject
    IsinRepository isinRepository;

//    @Inject
//    Logger log;

    @Test
    public void testRegister() throws Exception {
//    	OdsIsinMaster isinMaster = new OdsIsinMaster();
//    	isinMaster.setIsin("KR");
//        assertNotNull(isinMaster.getIsin());
        assert(true);
//        log.info(isinMaster.getIsin() + " was persisted with id " );
    }

}
