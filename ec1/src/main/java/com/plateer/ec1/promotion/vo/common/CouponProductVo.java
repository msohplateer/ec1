package com.plateer.ec1.promotion.vo.common;

import java.util.List;

import lombok.Data;

@Data
public class CouponProductVo {
	private Promotion promotion;
	private List<Product> productList;
	private String maxBenefitYn;
}