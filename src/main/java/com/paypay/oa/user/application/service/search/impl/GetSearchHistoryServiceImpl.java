package com.paypay.oa.user.application.service.search.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypay.oa.user.application.repository.search.GetSearchRepo;
import com.paypay.oa.user.application.service.search.GetSearchService;
import com.paypay.oa.user.domain.entity.SearchTerms;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GetSearchHistoryServiceImpl implements GetSearchService {
    private final GetSearchRepo getSearchRepo;

	@Override
	public List<SearchTerms> getSearchHistory(Long consumerId) {
		return getSearchRepo.findByConsumerId(consumerId);
	}

   
}
