package com.paypay.oa.user.application.repository.search;
import java.util.List;

import com.paypay.oa.user.domain.entity.SearchTerms;

public interface GetSearchRepo {

	/**
	 * 
	 * @param consumerId
	 * @return
	 */
	List<SearchTerms> findByConsumerId(Long consumerId);
	
	/**
	 * 
	 * @param consumerId
	 * @return
	 */
	Long countByConsumerId(Long consumerId);

}
