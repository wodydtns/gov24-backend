package com.self.gov24.search.controller;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.self.gov24.search.model.SearchListModel;
import com.self.gov24.search.service.SearchListService;

import io.swagger.annotations.ApiOperation;

@RestController
public class SearchListController {
	
	@Resource
	private SearchListService searchListService;
	
	@GetMapping(value = "/gov24/serviceList")
	public Page<SearchListModel> findAll(@PageableDefault(size=10, direction =Direction.ASC ) Pageable pageable)  throws Throwable{
		return searchListService.findAll(pageable);
		
	}
}
