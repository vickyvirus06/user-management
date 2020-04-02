package com.paypay.oa.user.application.service.search;

import javax.validation.Valid;

import com.paypay.oa.user.controller.request.search.AddSearchDetailsRequest;
import com.paypay.oa.user.domain.entity.SearchTerms;

public interface AddSearchService {
	
	/**
	 * 
	 * @param addSearchDetailsRequest
	 * @return
	 */
	SearchTerms createSearch(AddSearchDetailsRequest addSearchDetailsRequest);

}
