package com.plateer.ec1.promotion.service.impl;

import org.springframework.stereotype.Service;

import com.plateer.ec1.promotion.data.PromotionType;
import com.plateer.ec1.promotion.dto.request.PromotionRequestDto;
import com.plateer.ec1.promotion.dto.response.CartCouponResponseDto;
import com.plateer.ec1.promotion.dto.response.PriceDiscountResponseDto;
import com.plateer.ec1.promotion.dto.response.ProductCouponResponseDto;
import com.plateer.ec1.promotion.factory.CalculatorFactory;
import com.plateer.ec1.promotion.service.PromotionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PromotionServiceImpl implements PromotionService{
	
	private final CalculatorFactory factory;
	
	@Override
	public PriceDiscountResponseDto getPriceDiscountApplyData(PromotionRequestDto prDto) {
		return (PriceDiscountResponseDto) factory.getPromotionCalculationData(PromotionType.PRC_DC).getCalculationData(prDto);  
	}

	@Override
	public ProductCouponResponseDto getProductCouponApplyData(PromotionRequestDto prDto) {
		return (ProductCouponResponseDto) factory.getPromotionCalculationData(PromotionType.PRD_CUP).getCalculationData(prDto);  
	}

	@Override
	public CartCouponResponseDto getCartCouponApplyData(PromotionRequestDto prDto) {
		return (CartCouponResponseDto) factory.getPromotionCalculationData(PromotionType.CART_CUP).getCalculationData(prDto);  
	}

}
