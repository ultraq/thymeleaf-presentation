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

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * Utility object for working with Joda DateTime objects.
 * 
 * @author Emanuel Rabina
 */
public class JodaUtility {

	/**
	 * Create a new DateTime object.
	 * 
	 * @return New DateTime object for the current time.
	 */
	public DateTime createNow() {

		return new DateTime();
	}

	/**
	 * Format a Joda DateTime using the given pattern.
	 * 
	 * @param datetime
	 * @param pattern
	 * @return Formatted date string.
	 */
	public String format(DateTime datetime, String pattern) {

		return DateTimeFormat.forPattern(pattern).print(datetime);
	}
}
