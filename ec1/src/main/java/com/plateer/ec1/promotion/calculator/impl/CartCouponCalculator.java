package com.plateer.ec1.promotion.calculator.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.plateer.ec1.promotion.calculator.Calculator;
import com.plateer.ec1.promotion.data.PromotionType;
import com.plateer.ec1.promotion.dto.common.CouponProductsDto;
import com.plateer.ec1.promotion.dto.common.Promotion;
import com.plateer.ec1.promotion.dto.request.PromotionRequestDto;
import com.plateer.ec1.promotion.dto.response.BaseResponseDto;
import com.plateer.ec1.promotion.dto.response.CartCouponResponseDto;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CartCouponCalculator implements Calculator{
	
	@Override
	public PromotionType getType() {
		return PromotionType.CART_CUP;
	}

	private Promotion getAvailablePromotionData(PromotionRequestDto prDto) {
		log.info("적용 가능 장바구니 쿠폰 데이터 조회");
		
		Promotion promotion = new Promotion();
		
		promotion.setCouponIssueNo(100L);
		promotion.setDcAmt(1000L);
		promotion.setPromotionNo(1L);
		
		return new Promotion();
	}

	private CartCouponResponseDto calculateDcAmt(PromotionRequestDto prDto, Promotion prm) {
		log.info("장바구니 쿠폰 할인 적용 금액 계산");
		CouponProductsDto cpVo = new CouponProductsDto();
		List couponList = new ArrayList();
		
		cpVo.setProductList(prDto.getProductList());
		cpVo.setPromotion(prm);
		
		CartCouponResponseDto ccrDto = new CartCouponResponseDto();
		List couponProductsList = new ArrayList();
		
		couponProductsList.add(cpVo);
		
		ccrDto.setMemberNo(prDto.getMemberNo());
		ccrDto.setCouponProductsList(couponProductsList);
		
		return ccrDto;
	}

	private CartCouponResponseDto calculateMaxBenefit(CartCouponResponseDto vo) {
		log.info("장바구니 쿠폰 최대혜택 계산");
		return vo;
	}

	@Override
	public BaseResponseDto getCalculationData(PromotionRequestDto prDto) {
		log.info("CartCouponCalculation getCalculationData call");
		Promotion promotion = getAvailablePromotionData(prDto);
		CartCouponResponseDto vo = calculateDcAmt(prDto, promotion);
		CartCouponResponseDto resVo = calculateMaxBenefit(vo);
		return resVo;
	}

	

	
}
