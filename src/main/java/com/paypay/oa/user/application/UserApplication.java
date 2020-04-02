package com.paypay.oa.user.application;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypay.oa.user.application.service.search.AddSearchService;
import com.paypay.oa.user.application.service.search.GetSearchService;
import com.paypay.oa.user.controller.request.search.AddSearchDetailsRequest;
import com.paypay.oa.user.controller.response.search.GetSearchHistoryResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserApplication {
    private final GetSearchService getOrderService;
    private final AddSearchService addSearchService;
    
    /**
     * Fetch order history of given consumer
     *
     * @param consumerId
     * @param orderStatus
     * @return GetOrderDetailsResponse
     */
    public GetSearchHistoryResponse getSearchHistory(Long consumerId)  {
        
    	return GetSearchHistoryResponse.buildGetOrderHistoryResponse(getOrderService.getSearchHistory(consumerId));
    }
    
    /**
     * 
     * @param addSearchDetailsRequest
     * @param consumerId
     * @return
     */
	public Object addSearch(AddSearchDetailsRequest addSearchDetailsRequest, Long consumerId) {
		addSearchService.createSearch(addSearchDetailsRequest);
		return null;
	}
	
    
}
