package com.plateer.ec1.promotion.service;

import com.plateer.ec1.promotion.dto.request.PromotionRequestDto;
import com.plateer.ec1.promotion.dto.response.CartCouponResponseDto;
import com.plateer.ec1.promotion.dto.response.PriceDiscountResponseDto;
import com.plateer.ec1.promotion.dto.response.ProductCouponResponseDto;

public interface PromotionService {
	public PriceDiscountResponseDto getPriceDiscountApplyData(PromotionRequestDto dto);
	public ProductCouponResponseDto getProductCouponApplyData(PromotionRequestDto dto);
	public CartCouponResponseDto getCartCouponApplyData(PromotionRequestDto dto);
}
