package com.paypay.oa.user.dataaccess.rds;

import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.paypay.oa.user.domain.entity.SearchTag;

@Repository
public interface SearchTagRepository extends JpaRepository<SearchTag, Integer> {

	@Query("from SearchTag where startTime <= :currentTime  and endTime >= :currentTime")
	public List<SearchTag> getAllBetweenDates(@Param("currentTime")LocalTime currentTime); 
}
