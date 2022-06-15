package com.plateer.ec1.promotion.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RequestPromotionVo {
	private String memberNo;
	private List<Product> productList;
	private Long couponIssueNo;
}
