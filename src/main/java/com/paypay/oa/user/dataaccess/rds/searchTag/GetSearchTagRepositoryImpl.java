package com.paypay.oa.user.dataaccess.rds.searchTag;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypay.oa.user.application.repository.searchTag.GetSearchTagRepo;
import com.paypay.oa.user.dataaccess.rds.SearchRepository;
import com.paypay.oa.user.dataaccess.rds.SearchTagRepository;
import com.paypay.oa.user.domain.entity.SearchTag;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GetSearchTagRepositoryImpl implements GetSearchTagRepo{
	private final SearchTagRepository searchTagRepository;
	
	@Override
	public List<SearchTag> getSearchTag(LocalTime currentTime) {
		return searchTagRepository.getAllBetweenDates(currentTime);
	}

}
