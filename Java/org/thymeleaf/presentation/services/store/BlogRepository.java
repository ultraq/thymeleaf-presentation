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

package org.thymeleaf.presentation.services.store;

import java.util.List;

import javax.annotation.PostConstruct;

import nz.net.ultraq.jaxb.XMLReader;

import org.springframework.stereotype.Repository;
import org.thymeleaf.presentation.entities.blog.Blog;
import org.thymeleaf.presentation.entities.blog.Post;

/**
 * Repository/store layer for blog posts in the demo project.
 * 
 * @author Emanuel Rabina
 */
@Repository
public class BlogRepository {

	private Blog blog;

	/**
	 * Load the blog posts from the XML data file.
	 */
	@PostConstruct
	public void initializeData() {

		XMLReader<Blog> blogreader = new XMLReader<>(Blog.class);
		blogreader.addValidatingSchema(BlogRepository.class.getResourceAsStream(
				"org/thymeleaf/presentation/entities/Blog.xsd"));
		blog = blogreader.readXMLData(BlogRepository.class.getResourceAsStream(
				"org/thymeleaf/presentation/services/store/Blog.xml"));
	}

	/**
	 * Retrieve all blog posts.
	 * 
	 * @return A list of all blog posts.
	 */
	public List<Post> fetchAllPosts() {

		return blog.getPost();
	}
}
