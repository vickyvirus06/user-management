package com.paypay.oa.user.controller.response.searchTag;

import java.util.List;
import java.util.stream.Collectors;

import com.paypay.oa.user.controller.response.search.GetSearchHistoryResponse;
import com.paypay.oa.user.domain.entity.SearchTag;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetSearchTagResponse {

private List<String> searchTags;
private GetSearchTagTimeResponse timeRange;
    
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GetSearchTagTimeResponse
    {
    	private String startTime;
    	private String endTime;
    }

    public static GetSearchTagResponse buildGetSearchTagResponse(List<SearchTag> searchList,SearchTag searchTag) {
        List<String> searchTagList = searchList.stream().map(search ->
                 (search.getSearchQuery())
                 ).collect(Collectors.toList());
        
        GetSearchTagTimeResponse getSearchTimeResponse = GetSearchTagTimeResponse.builder()
        		.startTime(searchTag.getStartTime().toString())
        		.endTime(searchTag.getEndTime().toString())
        		.build();
        	
        return GetSearchTagResponse.builder().searchTags(searchTagList)
        		.timeRange(getSearchTimeResponse).build();
    }

}
