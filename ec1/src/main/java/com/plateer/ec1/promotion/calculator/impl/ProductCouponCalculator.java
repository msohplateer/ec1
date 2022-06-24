package com.plateer.ec1.promotion.calculator.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.plateer.ec1.promotion.calculator.Calculator;
import com.plateer.ec1.promotion.data.PromotionType;
import com.plateer.ec1.promotion.dto.common.ProductCouponsDto;
import com.plateer.ec1.promotion.dto.common.Promotion;
import com.plateer.ec1.promotion.dto.request.PromotionRequestDto;
import com.plateer.ec1.promotion.dto.response.BaseResponseDto;
import com.plateer.ec1.promotion.dto.response.ProductCouponResponseDto;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ProductCouponCalculator implements Calculator{
	
	@Override
	public PromotionType getType() {
		return PromotionType.PRD_CUP;
	}
		
	private Promotion getAvailablePromotionData(PromotionRequestDto prDto) {
		log.info("적용 가능 상품 쿠폰 데이터 조회");
		
		Promotion promotion = new Promotion();
		
		promotion.setCouponIssueNo(100L);
		promotion.setDcAmt(1000L);
		promotion.setPromotionNo(1L);
		
		return promotion;
	}

	private ProductCouponResponseDto calculateDcAmt(PromotionRequestDto prDto, Promotion prm) {
		log.info("상품 쿠폰 할인 적용 금액 계산");
		ProductCouponsDto pcDto = new ProductCouponsDto();
		List promotionList = new ArrayList();
		
		promotionList.add(prm);
		pcDto.setProduct(prDto.getProductList().get(0));
		pcDto.setPromotionList(promotionList);
		
		ProductCouponResponseDto pcrDto = new ProductCouponResponseDto();
		List productCouponsList = new ArrayList();
		
		productCouponsList.add(pcDto);
		
		pcrDto.setMemberNo(prDto.getMemberNo());
		pcrDto.setProductCouponsList(productCouponsList);
		
		return pcrDto;
	}

	private ProductCouponResponseDto calculateMaxBenefit(ProductCouponResponseDto vo) {
		log.info("상품 쿠폰 최대혜택 계산");
		return vo;
	}

	@Override
	public BaseResponseDto getCalculationData(PromotionRequestDto prDto) {
		log.info("PriceDiscountCalculation getCalculationData call");
		Promotion promotion = getAvailablePromotionData(prDto);
		ProductCouponResponseDto vo = calculateDcAmt(prDto, promotion);
		ProductCouponResponseDto resVo = calculateMaxBenefit(vo);
		return resVo;
	}

}
