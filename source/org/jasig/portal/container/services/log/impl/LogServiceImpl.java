/**
 * Copyright � 2004 The JA-SIG Collaborative.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. Redistributions of any form whatsoever must retain the following
 *    acknowledgment:
 *    "This product includes software developed by the JA-SIG Collaborative
 *    (http://www.jasig.org/)."
 *
 * THIS SOFTWARE IS PROVIDED BY THE JA-SIG COLLABORATIVE "AS IS" AND ANY
 * EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE JA-SIG COLLABORATIVE OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package org.jasig.portal.container.services.log.impl;

import java.util.Properties;

import javax.servlet.ServletConfig;

import org.jasig.portal.container.services.PortletContainerService;
import org.jasig.portal.services.LogService;


/**
 * Implementation of Apache Pluto LogService.
 * @author Ken Weiner, kweiner@unicon.net
 * @version $Revision$
 */
public class LogServiceImpl implements PortletContainerService, org.apache.pluto.services.log.LogService {
    
    private ServletConfig servletConfig = null;
    private Properties properties = null;
    
    // PortletContainerService methods
    
    public void init(ServletConfig servletConfig, Properties properties) throws Exception {
        this.servletConfig = servletConfig;
        this.properties = properties;
    }
    
    public void destroy() throws Exception {
        // Nothing to do at this time
    }

    // LogService methods
    
    public boolean isDebugEnabled(String aComponent) {
        return true;
    }

    public boolean isInfoEnabled(String aComponent) {
        return true;
    }

    public boolean isWarnEnabled(String aComponent) {
        return true;
    }

    public boolean isErrorEnabled(String aComponent) {
        return true;
    }

    public void debug(String aComponent, String aMessage) {
        LogService.log(LogService.DEBUG, aComponent + ": " + aMessage);
    }

    public void debug(String aComponent, String aMessage, Throwable aThrowable) {
        LogService.log(LogService.DEBUG, aComponent + ": " + aMessage, aThrowable);
    }


    public void info(String aComponent, String aMessage) {
        LogService.log(LogService.INFO, aComponent + ": " + aMessage);
    }

    public void warn(String aComponent, String aMessage) {
        LogService.log(LogService.WARN, aComponent + ": " + aMessage);
    }

    public void error(String aComponent, String aMessage, Throwable aThrowable) {
        LogService.log(LogService.ERROR, aComponent + ": " + aMessage, aThrowable);
    }

    public void error(String aComponent, Throwable aThrowable) {
        LogService.log(LogService.ERROR, aComponent, aThrowable);
    }

}
