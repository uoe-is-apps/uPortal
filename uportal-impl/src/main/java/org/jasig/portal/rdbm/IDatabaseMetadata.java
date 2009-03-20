/**
 * Copyright (c) 2000-2009, Jasig, Inc.
 * See license distributed with this file and available online at
 * https://www.ja-sig.org/svn/jasig-parent/tags/rel-10/license-header.txt
 */
package org.jasig.portal.rdbm;

import java.util.Date;

/**
 * @author susan.bramhall@yale.edu
 * @version $Revision$
 * Apr 8, 2005
 *
 */
public interface IDatabaseMetadata {
    /**
     * Gets the appropriate {@link IJoinQueryString} implemenation for
     * the database. If {@link #supportsOuterJoins()} returns <code>false</code>
     * this will return <code>null</code>.
     *
     * @return The appropriate {@link IJoinQueryString} implemenation.
     */
    public IJoinQueryString getJoinQuery();

    /**
     * Returns <code>true</code> if the database server supports outer
     * joins. The query to use if this returns <code>true</code> can
     * be retrieved from the {@link #getJoinQuery()} method.
     *
     * @return <code>true</code> if the server supports outer joins.
     */
    public boolean supportsOuterJoins();

    /**
     * Returns <code>true</code> if the database server supports transactions.
     *
     * @return <code>true</code> if the server supports transactions.
     */
    public boolean supportsTransactions();

    /**
     * Returns <code>true</code> if the database server supports prepared statements.
     *
     * @return <code>true</code> if the server supports prepared statements.
     */
    public boolean supportsPreparedStatements();

    /**
     * SQL TimeStamp format of current time.
     *
     * @return SQL TimeStamp of the current time.
     */
    public String sqlTimeStamp();

    /**
     * SQL TimeStamp format a long.
     *
     * @param date The time in milliseconds to format.
     * @return SQL TimeStamp of the specified time.
     */
    public String sqlTimeStamp(long date);

    /**
     * SQL TimeStamp format a Date.
     *
     * @param date The date to format.
     * @return SQL TimeStamp or "NULL" if date is null.
     */
    public String sqlTimeStamp(Date date);

    /**
     * @return Database Name
     */
    public String getDatabaseProductName();

    /**
     * @return Database Version
     */
    public String getDatabaseProductVersion();
    
    /**
     * @return The JDBC Driver being used
     */
    public String getJdbcDriver();

    /**
     * @return The JDBC Driver version
     */
    public String getJdbcDriverVersion();
    
    /**
     * @return The JDBC URL being used
     */
    public String getJdbcUrl();
    
    /**
     * @return The JDBC user name
     */
    public String getJdbcUser();
}