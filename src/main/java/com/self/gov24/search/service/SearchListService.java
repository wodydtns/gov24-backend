package com.self.gov24.search.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.self.gov24.search.model.SearchListModel;

public interface SearchListService {
	public Page<SearchListModel> findAll(Pageable pageable);
}
