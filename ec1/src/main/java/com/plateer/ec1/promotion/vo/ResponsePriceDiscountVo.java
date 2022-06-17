package com.plateer.ec1.promotion.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ResponsePriceDiscountVo extends ResponseBaseVo{
	private String memberNo;
	private List<Product> productList;
}
