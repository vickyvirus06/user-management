package com.paypay.oa.user.dataaccess.rds;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.paypay.oa.user.domain.entity.SearchTerms;

import java.util.List;

@Repository
public interface SearchRepository extends JpaRepository<SearchTerms, Long> {
	
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
	
	/**
	 * 
	 * @param consumerId
	 * @return
	 */
	List<SearchTerms> deleteByConsumerId(Long consumerId);
}
