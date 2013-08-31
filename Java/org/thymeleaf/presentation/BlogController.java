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

package org.thymeleaf.presentation;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.presentation.services.BlogService;

/**
 * Controller for both the JSP and Thymeleaf example pages.
 * 
 * @author Emanuel Rabina
 */
@Controller
@RequestMapping(method = RequestMethod.GET)
public class BlogController {

	@Inject
	private BlogService blogservice;

	/**
	 * Places all of the blog posts on the model, returns the JSP view.
	 * 
	 * @param model
	 * @return JSP view name.
	 */
	@RequestMapping(value = "/jsp-example/")
	public String blogPostsJSP(Model model) {

		model.addAttribute("blog.posts", blogservice.fetchAllPosts());
		return "Blog.jsp";
	}
}
