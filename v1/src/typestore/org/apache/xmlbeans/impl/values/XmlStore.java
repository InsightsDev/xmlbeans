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

package org.apache.xmlbeans.impl.values;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Map;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlSaxHandler;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.w3c.dom.Node;
import org.w3c.dom.DOMException;

public interface XmlStore
{
    //
    //
    //

    XmlObject loadXml ( String s,           SchemaType type, XmlOptions options ) throws XmlException;
    XmlObject loadXml ( InputStream in,     SchemaType type, XmlOptions options ) throws XmlException, IOException;
    XmlObject loadXml ( Reader r,           SchemaType type, XmlOptions options ) throws XmlException, IOException;
    XmlObject loadXml ( XMLInputStream xis, SchemaType type, XmlOptions options ) throws XmlException, XMLStreamException;
    XmlObject loadXml ( Node node,          SchemaType type, XmlOptions options ) throws XmlException;
    
    XmlSaxHandler newSaxHandler ( SchemaType type, XmlOptions options );

    XmlObject getObject ( );
}