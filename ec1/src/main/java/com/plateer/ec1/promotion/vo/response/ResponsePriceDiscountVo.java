package com.plateer.ec1.promotion.vo.response;

import java.util.List;

import com.plateer.ec1.promotion.vo.common.Product;

import lombok.Data;

@Data
public class ResponsePriceDiscountVo extends ResponseBaseVo{
	private String memberNo;
	private List<Product> productList;
}
	