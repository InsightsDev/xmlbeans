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
package org.apache.xmlbeans.impl.jam.provider;

import org.apache.xmlbeans.impl.jam.editable.EClass;

/**
 *
 * @author Patrick Calahan <pcal@bea.com>
 */
public interface EClassInitializer {

  /**
   * <p>Initializes the given EClass.  Returns true if the implementation
   * was able to resolve the java type represented by the clazz parameter
   * and do something to initialize it.</p>
   *
   * <p>Note that the type to be initialized will never be an array type,
   * a primitive, 'void', or 'java.lang.Object'.</p>
   *
   * @return
   */
  public boolean initialize(EClass clazz);

}