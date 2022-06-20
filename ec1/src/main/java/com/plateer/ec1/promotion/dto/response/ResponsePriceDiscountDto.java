package com.plateer.ec1.promotion.dto.response;

import java.util.List;

import com.plateer.ec1.promotion.dto.common.Product;

import lombok.Data;

@Data
public class ResponsePriceDiscountDto extends ResponseBaseDto{
	private String memberNo;
	private List<Product> productList;
}
	