package com.paypay.oa.user.application.service.searchTag.impl;

import java.time.LocalTime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paypay.oa.user.application.repository.searchTag.GetSearchTagRepo;
import com.paypay.oa.user.application.service.searchTag.GetSearchTagService;
import com.paypay.oa.user.controller.response.searchTag.GetSearchTagResponse;
import com.paypay.oa.user.domain.entity.SearchTag;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GetSearchTagServiceImpl implements GetSearchTagService{
	private final GetSearchTagRepo getSearchTagRepo;
	
	
	@Override
	public GetSearchTagResponse searchTags() {
		System.out.println(getSearchTagRepo.getSearchTag(LocalTime.now()));
		List<SearchTag> searchTags =  getSearchTagRepo.getSearchTag(LocalTime.now());
		SearchTag searchTag = searchTags.get(0);
		return GetSearchTagResponse.buildGetSearchTagResponse(searchTags, searchTag);
	}

}
