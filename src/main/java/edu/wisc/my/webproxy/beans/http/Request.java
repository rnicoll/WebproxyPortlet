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

/*******************************************************************************
* Copyright 2004, The Board of Regents of the University of Wisconsin System.
* All rights reserved.
*
* A non-exclusive worldwide royalty-free license is granted for this Software.
* Permission to use, copy, modify, and distribute this Software and its
* documentation, with or without modification, for any purpose is granted
* provided that such redistribution and use in source and binary forms, with or
* without modification meets the following conditions:
*
* 1. Redistributions of source code must retain the above copyright notice,
* this list of conditions and the following disclaimer.
*
* 2. Redistributions in binary form must reproduce the above copyright notice,
* this list of conditions and the following disclaimer in the documentation
* and/or other materials provided with the distribution.
*
* 3. Redistributions of any form whatsoever must retain the following
* acknowledgement:
*
* "This product includes software developed by The Board of Regents of
* the University of Wisconsin System."
*
*THIS SOFTWARE IS PROVIDED BY THE BOARD OF REGENTS OF THE UNIVERSITY OF
*WISCONSIN SYSTEM "AS IS" AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING,
*BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
*PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE BOARD OF REGENTS OF
*THE UNIVERSITY OF WISCONSIN SYSTEM BE LIABLE FOR ANY DIRECT, INDIRECT,
*INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
*LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
*PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
*LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
*OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
*ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*******************************************************************************/
package edu.wisc.my.webproxy.beans.http;

import java.util.Collection;

import org.apache.http.cookie.Cookie;

/**
 * Represents the data needed to make a HTTP request.
 * 
 * @author nramzan
 * 
 * @version $Id$
 * 
 */
public interface Request {
     /** 
      * Add an additional cookie to be sent as part of the request.
      */
     public void addCookie(final Cookie cookie);
 
     /**
      * Get extra cookies to be sent with the request.
      */
     public Collection<Cookie> getExtraCookies();
     
	/** 
     * Sets the Static Headers to this object 
     *
     * @param h the Headers to use for the request
     */
    void setHeaders(IHeader[] h);
    
    /** 
     * Retrieves an array of Headers that this  object contains.
     *
     * @return Header[] an array of Headers that this object contains.
     */
    IHeader[] getHeaders();
    
    /** 
     * Sets the  base url that is needed to make the request.
     * It may be not be null
     *
     * @param url the url as a string that is needed to make request to the remote server.
     * 
     */
    
    void setUrl(String url);
    
    /** 
     * Retrieves the base url as a String that this  object contains
     *
     * @return url the url as String that this object contains.
     * 
     */
    
    
    String getUrl();

    
    /** 
     * Sets the type (GET, POST, HEAD) of the request that need to made to the remote server
     * It may not be null
     *
     * @param type the request type as a String that need to be made to the remote server
     * 
     */
    
    void setType(String type); //GET, POST, HEAD, etc..
    
    /** 
     * Retrieves the type of the request that this  object contains
     *
     * @return type the request type as String that this object contains.
     * 
     */
    
    String getType();
    
    /** 
     * Creates and return an empty Header
     *
     * @return header a empty Header that has no name and value.
     * 
     */
    
    IHeader createHeader(String name, String value);
    
    /** 
     * Sets all the post parameters on this object contained in map to make a post request
     *
     * @param postParameters a Map containing all the parameters to make a post request.
     * 
     */
    
    void setParameters(ParameterPair[] attributes);
    
    /** 
     * Retrieves all the post parameters on this object contained in map to make a post request
     *
     * @return postParameters a Map containing all the parameters to make a post request.
     * 
     */
    
    ParameterPair[] getParameters();
    
    /** 
     * There are a few differnt type of HTTP authentications, such as Basic, Form-based, NTLM etc.  
     * Sets the type(Basic, Form, NTML) of the authentication that need to be used for successful authentication
     *
     * @param authType the authentication type as a String to identify the type of authentication request
     * 
     */
    void setAuthType(String authType);
    
    /** 
     * Retrives the type(Basic, Form, NTML) of the authentication that was set on this object
     *
     * @return authType the authentication type as a String that was set on thsi object
     * 
     */
    
    String getAuthType();
}

