package com.plateer.ec1.promotion.dto.request;

import java.util.List;

import com.plateer.ec1.promotion.dto.common.Product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class PromotionRequestDto {
	private String memberNo;
	private List<Product> productList;
	private List couponIssueNoList;
}
