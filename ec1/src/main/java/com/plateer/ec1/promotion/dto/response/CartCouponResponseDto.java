package com.plateer.ec1.promotion.dto.response;

import java.util.List;

import com.plateer.ec1.promotion.dto.common.CouponProductsDto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CartCouponResponseDto extends BaseResponseDto{
	private String memberNo;
	private List<CouponProductsDto> couponProductsList;
}
