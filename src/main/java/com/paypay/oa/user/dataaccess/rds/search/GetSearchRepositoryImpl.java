package com.paypay.oa.user.dataaccess.rds.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypay.oa.user.application.repository.search.GetSearchRepo;
import com.paypay.oa.user.dataaccess.rds.SearchRepository;
import com.paypay.oa.user.domain.entity.SearchTerms;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GetSearchRepositoryImpl implements GetSearchRepo {
    private final SearchRepository searchRepository;
    
	@Override
	public List<SearchTerms> findByConsumerId(Long consumerId) {
		return searchRepository.findByConsumerId(consumerId);
	}

   }
