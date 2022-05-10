package com.self.gov24.search.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.self.gov24.search.model.SearchListModel;


@EnableJpaRepositories
public interface SearchListRepository extends JpaRepository<SearchListModel,String>{
	
	public Page<SearchListModel> findAll(Pageable  pageable);
}
