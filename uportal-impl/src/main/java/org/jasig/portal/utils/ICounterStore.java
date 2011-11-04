/**
 * Copyright (c) 2000-2009, Jasig, Inc.
 * See license distributed with this file and available online at
 * https://www.ja-sig.org/svn/jasig-parent/tags/rel-10/license-header.txt
 */
package org.jasig.portal.utils;

/**
 * A store interface that keeps track of multiple unique ID counters.
 *
 * @author Peter Kharchenko  {@link <a href="mailto:pkharchenko@interactivebusiness.com"">pkharchenko@interactivebusiness.com"</a>}
 * @version $Revision$
 */
public interface ICounterStore {

    /**
     * Create a new coutner
     *
     * @param counterName a name for the new counter
     * @exception Exception if an error occurs
     */
    public void createCounter(String counterName) throws Exception;

    /**
     * Reset a value of a counter.
     *
     * @param counterName a counter name
     * @param value a new counter value
     * @exception Exception if an error occurs
     */
    public void setCounter(String counterName, int value) throws Exception;

    /**
     * Obtain current coutner value and increment it.
     *
     * @param counterName a <code>String</code> value
     * @return an <code>int</code> value
     * @exception Exception if an error occurs
     */
    public int getIncrementIntegerId(String counterName) throws Exception;

}