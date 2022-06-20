package com.plateer.ec1.promotion.calculator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.plateer.ec1.promotion.dto.common.CouponProductDto;
import com.plateer.ec1.promotion.dto.common.ProductCouponDto;
import com.plateer.ec1.promotion.dto.common.Promotion;
import com.plateer.ec1.promotion.dto.request.RequestPromotionDto;
import com.plateer.ec1.promotion.dto.response.ResponseBaseDto;
import com.plateer.ec1.promotion.dto.response.ResponseCartCouponDto;
import com.plateer.ec1.promotion.dto.response.ResponseProductCouponDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CartCouponCalculator implements Calculator{
	
	private RequestPromotionDto reqVo = null;
	
	public CartCouponCalculator(RequestPromotionDto reqVo){
		this.reqVo = reqVo;
	}

	private Promotion getAvailablePromotionData(RequestPromotionDto reqVo) {
		log.info("적용 가능 장바구니 쿠폰 데이터 조회");
		
		Promotion promotion = new Promotion();
		
		promotion.setCouponIssueNo(100L);
		promotion.setDcAmt(1000L);
		promotion.setPromotionNo(1L);
		
		return new Promotion();
	}

	private ResponseCartCouponDto calculateDcAmt(RequestPromotionDto reqVo, Promotion prm) {
		log.info("장바구니 쿠폰 할인 적용 금액 계산");
		CouponProductDto cpVo = new CouponProductDto();
		List couponList = new ArrayList();
		
		cpVo.setMaxBenefitYn("Y");
		cpVo.setProductList(reqVo.getProductList());
		cpVo.setPromotion(prm);
		
		ResponseCartCouponDto rpcVo = new ResponseCartCouponDto();
		List productPromotionList = new ArrayList();
		
		productPromotionList.add(cpVo);
		
		rpcVo.setMemberNo(reqVo.getMemberNo());
		rpcVo.setPromotionProductList(productPromotionList);
		
		return rpcVo;
	}

	private ResponseCartCouponDto calculateMaxBenefit(ResponseCartCouponDto vo) {
		log.info("장바구니 쿠폰 최대혜택 계산");
		return vo;
	}

	@Override
	public ResponseBaseDto getCalculationData() {
		log.info("CartCouponCalculation getCalculationData call");
		Promotion promotion = getAvailablePromotionData(this.reqVo);
		ResponseCartCouponDto vo = calculateDcAmt(this.reqVo, promotion);
		ResponseCartCouponDto resVo = calculateMaxBenefit(vo);
		return resVo;
	}

	
}
