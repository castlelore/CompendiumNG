/*
		Copyright [2014] [Michal Stekrt]

		Licensed under the Apache License, Version 2.0 (the "License");
		you may not use this file except in compliance with the License.
		You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

		Unless required by applicable law or agreed to in writing, software
		distributed under the License is distributed on an "AS IS" BASIS,
		WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		See the License for the specific language governing permissions and
		limitations under the License.

 */
package api.memory.elements;

import api.memory.exceptions.NodeCollisionException;

import java.util.Map;

/**
 * INode is primary element of CNG map
 */
public abstract class INode extends IElement {


	/**
	 * @param icon              - url to the icon representing this node
	 * @param custom_properties set of custom properties
	 * @return created node
	 */
	public abstract INode Node(String icon, Map<String, Value> custom_properties) throws NodeCollisionException;

	public abstract INode Node(Map<String, Value> custom_properties) throws NodeCollisionException;

	public abstract INode Node(String icon) throws NodeCollisionException;

	public abstract INode Node() throws NodeCollisionException;




}
