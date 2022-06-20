package com.plateer.ec1.promotion.calculator;

import org.springframework.stereotype.Service;

import com.plateer.ec1.promotion.dto.common.Promotion;
import com.plateer.ec1.promotion.dto.request.RequestPromotionDto;
import com.plateer.ec1.promotion.dto.response.ResponseBaseDto;
import com.plateer.ec1.promotion.dto.response.ResponseCartCouponDto;
import com.plateer.ec1.promotion.dto.response.ResponsePriceDiscountDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PriceDiscountCalculator implements Calculator{
	
	private RequestPromotionDto reqVo;
	
	public PriceDiscountCalculator(RequestPromotionDto reqVo){
		this.reqVo = reqVo;
	}
	
	private Promotion getAvailablePromotionData(RequestPromotionDto reqVo) {
		log.info("적용 가능 가격 할인 금액 데이터 조회");
		return new Promotion();
	}

	private ResponsePriceDiscountDto calculateDcAmt(RequestPromotionDto reqVo, Promotion prm) {
		log.info("가격 할인 적용 금액 계산");
		ResponsePriceDiscountDto rpdVo = new ResponsePriceDiscountDto();
		rpdVo.setMemberNo(reqVo.getMemberNo());
		rpdVo.setProductList(reqVo.getProductList());
		return rpdVo;
	}


	@Override
	public ResponseBaseDto getCalculationData() {
		log.info("ResponseBaseVo getCalculationData call");
		Promotion promotion = getAvailablePromotionData(this.reqVo);
		ResponsePriceDiscountDto resVo = calculateDcAmt(this.reqVo, promotion);
		return resVo;
	}
}
