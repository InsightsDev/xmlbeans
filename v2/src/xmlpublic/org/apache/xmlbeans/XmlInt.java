/*   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.xmlbeans;

import javax.xml.stream.XMLStreamReader;


/**
 * Corresponds to the XML Schema
 * <a target="_blank" href="http://www.w3.org/TR/xmlschema-2/#int">xs:int</a> type.
 * One of the derived types based on <a target="_blank" href="http://www.w3.org/TR/xmlschema-2/#decimal">xs:decimal</a>.
 * <p>
 * Naturally, convertible to a Java int.
 */ 
public interface XmlInt extends XmlLong
{
    /** The constant {@link SchemaType} object representing this schema type. */
    public static final SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_int");
    
    /** Returns this value as an int */
    int getIntValue();
    /** Sets this value as an int */
    void setIntValue(int v);

    /**
     * Returns this value as an int
     * @deprecated replaced with {@link #getIntValue}
     **/
    int intValue();
    /**
     * Sets this value as an int
     * @deprecated replaced with {@link #setIntValue}
     **/
    void set(int v);

    /**
     * A class with methods for creating instances
     * of {@link XmlInt}.
     */
    public static final class Factory
    {
        /** Creates an empty instance of {@link XmlInt} */
        public static XmlInt newInstance() {
          return (XmlInt) XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** Creates an empty instance of {@link XmlInt} */
        public static XmlInt newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (XmlInt) XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** Creates an immutable {@link XmlInt} value */
        public static XmlInt newValue(Object obj) {
          return (XmlInt) type.newValue( obj ); }
        
        /** Parses a {@link XmlInt} fragment from a String. For example: "<code>&lt;xml-fragment&gt;1234567&lt;/xml-fragment&gt;</code>". */
        public static XmlInt parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        /** Parses a {@link XmlInt} fragment from a String. For example: "<code>&lt;xml-fragment&gt;1234567&lt;/xml-fragment&gt;</code>". */
        public static XmlInt parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        /** Parses a {@link XmlInt} fragment from a File. */
        public static XmlInt parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        /** Parses a {@link XmlInt} fragment from a File. */
        public static XmlInt parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        /** Parses a {@link XmlInt} fragment from a URL. */
        public static XmlInt parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( u, type, null ); }

        /** Parses a {@link XmlInt} fragment from a URL. */
        public static XmlInt parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( u, type, options ); }

        /** Parses a {@link XmlInt} fragment from an InputStream. */
        public static XmlInt parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        /** Parses a {@link XmlInt} fragment from an InputStream. */
        public static XmlInt parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        /** Parses a {@link XmlInt} fragment from a Reader. */
        public static XmlInt parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        /** Parses a {@link XmlInt} fragment from a Reader. */
        public static XmlInt parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        /** Parses a {@link XmlInt} fragment from a DOM Node. */
        public static XmlInt parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        /** Parses a {@link XmlInt} fragment from a DOM Node. */
        public static XmlInt parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** Parses a {@link XmlInt} fragment from an XMLInputStream. */
        public static XmlInt parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** Parses a {@link XmlInt} fragment from an XMLInputStream. */
        public static XmlInt parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** Parses a {@link XmlInt} fragment from an XMLStreamReader. */
        public static XmlInt parse(javax.xml.stream.XMLStreamReader xsr) throws org.apache.xmlbeans.XmlException {
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( xsr, type, null ); }
        
        /** Parses a {@link XmlInt} fragment from an XMLStreamReader. */
        public static XmlInt parse(javax.xml.stream.XMLStreamReader xsr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException{
          return (XmlInt) XmlBeans.getContextTypeLoader().parse( xsr, type, options ); }
        
        /** Returns a validating XMLInputStream. */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** Returns a validating XMLInputStream. */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

