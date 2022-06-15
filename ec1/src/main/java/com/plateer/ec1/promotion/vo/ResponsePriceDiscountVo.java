package com.plateer.ec1.promotion.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponsePriceDiscountVo extends ResponseBaseVo{
	private String memberNo;
	private List<Product> productList;
}
