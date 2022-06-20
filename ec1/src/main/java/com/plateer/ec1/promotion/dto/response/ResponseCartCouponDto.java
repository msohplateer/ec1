package com.plateer.ec1.promotion.dto.response;

import java.util.List;

import com.plateer.ec1.promotion.dto.common.CouponProductDto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ResponseCartCouponDto extends ResponseBaseDto{
	private String memberNo;
	private List<CouponProductDto> promotionProductList;
}
