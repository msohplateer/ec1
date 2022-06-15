package com.plateer.ec1.promotion.vo;

import java.util.List;

import lombok.Data;

@Data
public class ProductCouponVo {
	private Product product;
	private List<Promotion> promotionList;
	private String maxBenefitYn;
}
