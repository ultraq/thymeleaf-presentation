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

import org.thymeleaf.context.IProcessingContext;
import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.dialect.IExpressionEnhancingDialect;

import java.util.HashMap;
import java.util.Map;

/**
 * Custom dialect to show-off extending Thymeleaf.
 * 
 * @author Emanuel Rabina
 */
public class PresentationDialect extends AbstractDialect implements IExpressionEnhancingDialect {

	public static final String PRESENTATION_NAMESPACE = "http://www.thymeleaf.org/presentation";
	public static final String PRESENTATION_PREFIX = "presentation";

	public static final String JODA_UTILITY = "joda";

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String,Object> getAdditionalExpressionObjects(IProcessingContext processingContext) {

		HashMap<String,Object> expressionobjects = new HashMap<>();
		expressionobjects.put(JODA_UTILITY, new JodaUtility());
		return expressionobjects;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getPrefix() {

		return PRESENTATION_PREFIX;
	}

	/**
	 * This dialect is not lenient.
	 * 
	 * @return <tt>false</tt>
	 */
	@Override
	public boolean isLenient() {

		return false;
	}
}
