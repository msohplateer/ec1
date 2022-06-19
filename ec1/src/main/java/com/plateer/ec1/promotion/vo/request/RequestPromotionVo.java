package com.plateer.ec1.promotion.vo.request;

import java.util.List;

import com.plateer.ec1.promotion.vo.common.Product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class RequestPromotionVo {
	private String memberNo;
	private List<Product> productList;
	private Long couponIssueNo;
}
