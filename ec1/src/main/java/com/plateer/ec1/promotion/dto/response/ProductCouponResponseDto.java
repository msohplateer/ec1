package com.plateer.ec1.promotion.dto.response;

import java.util.List;

import com.plateer.ec1.promotion.dto.common.ProductCouponsDto;

import lombok.Data;

@Data
public class ProductCouponResponseDto extends BaseResponseDto{
	private String memberNo;
	private List<ProductCouponsDto> productCouponsList;
}
