package com.paypay.oa.user.dataaccess.rds.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypay.oa.user.application.repository.search.PersistSearchRepo;
import com.paypay.oa.user.dataaccess.rds.SearchRepository;
import com.paypay.oa.user.domain.entity.SearchTerms;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AddSearchRepositoryImpl implements PersistSearchRepo {
	private final SearchRepository searchRepository;
	
	@Override
	public SearchTerms add(SearchTerms searchTerms) {
		searchRepository.save(searchTerms);
		return null;
	}

}
