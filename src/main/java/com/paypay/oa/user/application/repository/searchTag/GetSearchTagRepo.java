package com.paypay.oa.user.application.repository.searchTag;

import java.time.LocalTime;
import java.util.List;

import com.paypay.oa.user.domain.entity.SearchTag;

public interface GetSearchTagRepo {
	/**
	 * 
	 * @param localTime
	 * @return
	 */
	List<SearchTag> getSearchTag(LocalTime localTime);
}
