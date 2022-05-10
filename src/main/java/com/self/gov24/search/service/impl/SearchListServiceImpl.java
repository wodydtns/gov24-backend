package com.self.gov24.search.service.impl;


import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.self.gov24.search.model.SearchListModel;
import com.self.gov24.search.repository.SearchListRepository;
import com.self.gov24.search.service.SearchListService;

@Service
public class SearchListServiceImpl implements SearchListService{
	
	@Resource
	private SearchListRepository searchListRepository;

	@Override
	public Page<SearchListModel> findAll(Pageable pageable) {
		return searchListRepository.findAll(pageable);
	}

}
