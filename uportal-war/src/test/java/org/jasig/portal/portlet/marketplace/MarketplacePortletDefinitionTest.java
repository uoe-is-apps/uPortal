/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.portal.portlet.marketplace;

import org.jasig.portal.portlet.om.IPortletDefinition;
import org.jasig.portal.portlet.registry.IPortletCategoryRegistry;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Unit tests for MarketplacePortletDefinition.
 */
public class MarketplacePortletDefinitionTest {

    @Mock IPortletDefinition portletDefinition;

    @Mock IPortletCategoryRegistry categoryRegistry;

    MarketplacePortletDefinition marketplacePortletDefinition;

    @Before
    public void setUp() {
        initMocks(this);

        marketplacePortletDefinition =
            new MarketplacePortletDefinition(portletDefinition, categoryRegistry);

    }

    /**
     * Test that a MarketplacePortletDefinition passes through the
     * alternativeMaximizedLink of the IPortletDefinition it wraps.
     */
    @Test
    public void testReflectsWrappedDefinitionAlternativeMaximizedLink() {

        when(portletDefinition.getAlternativeMaximizedLink()).thenReturn("http://apereo.org");

        assertEquals("http://apereo.org",
            marketplacePortletDefinition.getAlternativeMaximizedLink());
    }

    /**
     * Test that when there is an alternative maximized link, the render URL is that link.
     */
    @Test
    public void testRenderUrlIsAlternativeMaximizedLinkWhenPresent() {

        when(portletDefinition.getAlternativeMaximizedLink()).thenReturn("http://apereo.org");

        assertEquals("http://apereo.org",
            marketplacePortletDefinition.getRenderUrl());

    }

}