package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Long visites;
	private Long deals;
	
	public SaleSuccessDTO() {
	}

	public SaleSuccessDTO(Seller seller, Long visites, Long deals) {
		sellerName = seller.getName();
		this.visites = visites;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisites() {
		return visites;
	}

	public void setVisites(Long visites) {
		this.visites = visites;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}
}
