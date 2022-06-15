package com.plateer.ec1.promotion.calculation;

import org.springframework.stereotype.Service;

import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.ResponseBaseVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PriceDiscountCalculation implements Calculation{
	private RequestPromotionVo reqVo;
	public PriceDiscountCalculation(RequestPromotionVo reqVo){
		this.reqVo = reqVo;
	}
	
	private Promotion getAvailablePromotionData(RequestPromotionVo reqVo) {
		log.info("적용 가능 가격 할인 금액 데이터 조회");
		return null;
	}

	private ResponseBaseVo calculateDcAmt(RequestPromotionVo reqVo, Promotion prm) {
		log.info("가격 할인 적용 금액 계산");
		return null;
	}


	@Override
	public ResponseBaseVo getCalculationData() {
		log.info("ResponseBaseVo getCalculationData call");
		getAvailablePromotionData(reqVo);
		calculateDcAmt(reqVo, null);
		return null;
	}
}
