package com.plateer.ec1.promotion.dto.common;

import java.util.List;

import lombok.Data;

@Data
public class CouponProductsDto {
	private Promotion promotion;
	private List<Product> productList;
}
