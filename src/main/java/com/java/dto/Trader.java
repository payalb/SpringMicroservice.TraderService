package com.java.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Trader {
	@Id
	@GeneratedValue
	public int traderId;
	@NotEmpty
	public String name;
	@Builder.Default
	@ManyToMany
	public List<Quotes> stocks= new ArrayList<>(); 
	private double portfolioPrice;
}
