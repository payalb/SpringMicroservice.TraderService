package com.java.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RestResource;

import com.java.dto.Quotes;
import com.java.dto.Trader;

public interface TraderRepository extends JpaRepository<Trader, Integer>{

	@RestResource(path="/stocks")
	@Query("select stocks from Trader where traderId = ?1")
	public List<Quotes> getStocks( int id);
}
