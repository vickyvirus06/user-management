package com.paypay.oa.user.application.repository.search;

import com.paypay.oa.user.domain.entity.SearchTerms;

public interface PersistSearchRepo {
    
	/**
	 * 
	 * @param searchTerms
	 * @return
	 */
	void add(SearchTerms searchTerms);
	
	/**
	 * 
	 * @param consumerId
	 */
	void delete(Long consumerId);
}
