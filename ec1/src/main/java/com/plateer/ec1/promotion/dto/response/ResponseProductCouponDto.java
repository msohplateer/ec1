package com.plateer.ec1.promotion.dto.response;

import java.util.List;

import com.plateer.ec1.promotion.dto.common.ProductCouponDto;

import lombok.Data;

@Data
public class ResponseProductCouponDto extends ResponseBaseDto{
	private String memberNo;
	private List<ProductCouponDto> productPromotionList;
}
