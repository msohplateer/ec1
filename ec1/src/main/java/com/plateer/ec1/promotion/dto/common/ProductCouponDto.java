package com.plateer.ec1.promotion.dto.common;

import java.util.List;

import lombok.Data;

@Data
public class ProductCouponDto {
	private Product product;
	private List<Promotion> promotionList;
	private String maxBenefitYn;
}
