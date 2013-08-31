/*
 * Copyright 2013, Emanuel Rabina (http://www.ultraq.net.nz/)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.thymeleaf.presentation.dialect;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.ProcessorResult;
import org.thymeleaf.processor.attr.AbstractAttrProcessor;

/**
 * Custom processor to show-off extending Thymeleaf.
 * 
 * @author Emanuel Rabina
 */
public class MyProcessor extends AbstractAttrProcessor {

	public MyProcessor() {

		super("");
	}

	@Override
	public int getPrecedence() {
		return 0;
	}

	@Override
	protected ProcessorResult processAttribute(Arguments args, Element el, String attrName) {
		return null;
	}
}
