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

package org.apache.xmlbeans.impl.common;

/**
 * Author: Cezar Andrei (cezar.andrei at bea.com)
 * Date: Nov 25, 2003
 */
public class ParseUtil
{
    public static String trimInitialPlus(String xml)
    {
        if (xml!=null && xml.charAt(0) == '+') {
            return xml.substring(1);
        } else {
            return xml;
        }
    }
}
