package com.paypay.oa.user.controller.response.search;

import java.util.List;

import java.util.stream.Collectors;

import com.paypay.oa.user.domain.entity.SearchTerms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetSearchHistoryResponse {
    private List<String> searchHistory;

    public static GetSearchHistoryResponse buildGetSearchHistoryResponse(List<SearchTerms> searchList) {
        List<String> searchHistoryList = searchList.stream().map(search ->
                (search.getSearchQuery())
                 ).collect(Collectors.toList());
        return GetSearchHistoryResponse.builder().searchHistory(searchHistoryList).build();
    }
}
