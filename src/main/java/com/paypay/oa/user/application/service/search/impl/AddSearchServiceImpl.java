package com.paypay.oa.user.application.service.search.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypay.oa.user.application.repository.search.GetSearchRepo;
import com.paypay.oa.user.application.repository.search.PersistSearchRepo;
import com.paypay.oa.user.application.service.search.AddSearchService;
import com.paypay.oa.user.controller.request.search.AddSearchDetailsRequest;
import com.paypay.oa.user.domain.entity.SearchTerms;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AddSearchServiceImpl implements AddSearchService{
	private final PersistSearchRepo persistSearchRepo;
	private final GetSearchRepo getSearchRepo;
	
	@Override
	public void createSearch(AddSearchDetailsRequest addSearchDetailsRequest) {
		
		Long count = getSearchRepo.countByConsumerId(addSearchDetailsRequest.getConsumerId());
		if(count>=5)
		{
			persistSearchRepo.delete(addSearchDetailsRequest.getConsumerId());
			persistSearchRepo.add(setSearchEntity(addSearchDetailsRequest));
		}
		else
		{
			persistSearchRepo.add(setSearchEntity(addSearchDetailsRequest));
		}
	}
	
	

	private SearchTerms setSearchEntity(AddSearchDetailsRequest addSearchDetailsRequest) {
		LocalDateTime localDateTime = LocalDateTime.now();
		return SearchTerms.builder()
				.consumerId(addSearchDetailsRequest.getConsumerId())
				.searchQuery(addSearchDetailsRequest.getSearchQuery())
				.searchDate(localDateTime)
				.build();
		
	}



	

}
