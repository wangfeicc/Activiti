/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.editor.language.bpmn.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tijs Rademakers
 */
public class ThrowEvent extends Event {

  protected List<ActivitiListener> executionListeners = new ArrayList<ActivitiListener>();

  public List<ActivitiListener> getExecutionListeners() {
    return executionListeners;
  }

  public void setExecutionListeners(List<ActivitiListener> executionListeners) {
    this.executionListeners = executionListeners;
  }
}