package com.paypay.oa.user.application;

import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.paypay.oa.user.application.service.search.AddSearchService;
import com.paypay.oa.user.application.service.search.GetSearchService;
import com.paypay.oa.user.application.service.searchTag.GetSearchTagService;
import com.paypay.oa.user.constants.OAUserManagementResultCode;
import com.paypay.oa.user.controller.request.search.AddSearchDetailsRequest;
import com.paypay.oa.user.controller.response.search.GetSearchHistoryResponse;
import com.paypay.oa.user.controller.response.searchTag.GetSearchTagResponse;
import com.paypay.oa.user.exception.OAUserManagementException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserApplication {
    private final GetSearchService getSearchService;
    private final AddSearchService addSearchService;
    private final GetSearchTagService getSearchTagService;
    
    /**
     * Fetch order history of given consumer
     *
     * @param consumerId
     * @param orderStatus
     * @return GetOrderDetailsResponse
     */
    public GetSearchHistoryResponse getSearchHistory(Long consumerId)  {
        
    	return GetSearchHistoryResponse.buildGetSearchHistoryResponse(getSearchService.getSearchHistory(consumerId));
    }
    
    /**
     * 
     * @param addSearchDetailsRequest
     * @param consumerId
     * @return
     */
    @Transactional
	public void addSearch(AddSearchDetailsRequest addSearchDetailsRequest, Long consumerId) {
    	if ((addSearchDetailsRequest.getSearchQuery()).isEmpty() || addSearchDetailsRequest.getSearchQuery().equals(" "))
            throw new OAUserManagementException(OAUserManagementResultCode.SEARCH_QUERY_MISSING_ERROR);
        
    	addSearchService.createSearch(addSearchDetailsRequest);
		
	}

    /**
     * 
     * @return
     */
	public GetSearchTagResponse getSearchTags() {
		return getSearchTagService.searchTags();
		}
	
    
}
