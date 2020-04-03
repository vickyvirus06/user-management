package com.paypay.oa.user.application.service.search;


import java.util.List;

import com.paypay.oa.user.domain.entity.SearchTerms;

public interface GetSearchService {
	/**
	 * 
	 * @param consumerId
	 * @return
	 */
	List<SearchTerms> getSearchHistory(Long consumerId);
	
	
}
