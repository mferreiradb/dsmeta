package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // PREPARA O CÓDIGO PARA QUE A CLASSE SEJA EQUIVALENTE A UMA ENTIDADE DO DB
@Table(name = "tb_sales") // CUSTOMIZA O NOME DA TABELA
public class Sale {
	
	@Id // DEFINE A PRIMARY KEY
	@GeneratedValue(strategy =GenerationType.IDENTITY) // DEFINE O AUTO INCREMENT
	private Long id;
	private String sellerName;
	private int visited;
	private int deals;
	private Double amount;
	private LocalDate date;
	
	public Sale() {}

	public Long getId() {
		return id; 
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public int getVisited() {
		return visited;
	}

	public void setVisited(int visited) {
		this.visited = visited;
	}

	public int getDeals() {
		return deals;
	}

	public void setDeals(int deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
