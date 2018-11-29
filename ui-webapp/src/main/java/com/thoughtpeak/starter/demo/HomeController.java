/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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
package com.thoughtpeak.starter.demo;

import com.thoughtpeak.starter.data.dao.ExampleUserDao;
import com.google.common.collect.Lists;
import com.thoughtpeak.starter.data.model.AccountUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;
import java.util.Optional;


// tag::code[]
@Controller
public class HomeController {

	@Autowired
	private ExampleUserDao userDao;


	@RequestMapping(value = "/")
	public String index(Model model) {

		Optional<AccountUserEntity> t = userDao.findById(1L);
		List<AccountUserEntity> pathwayEntityList = Lists.newArrayList(userDao.findAll());
		model.addAttribute("pathwayList",pathwayEntityList);

		return "index";
	}

}
// end::code[]