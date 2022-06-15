package com.plateer.ec1.promotion.calculation;

import org.springframework.stereotype.Service;

import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.ResponseBaseVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductCouponCalculation implements Calculation{
	private RequestPromotionVo reqVo;
	public ProductCouponCalculation(RequestPromotionVo reqVo){
		this.reqVo = reqVo;
	}
	private Promotion getAvailablePromotionData(RequestPromotionVo reqVo) {
		log.info("적용 가능 상품 쿠폰 데이터 조회");
		return null;
	}

	private ResponseBaseVo calculateDcAmt(RequestPromotionVo reqVo, Promotion prm) {
		log.info("상품 쿠폰 할인 적용 금액 계산");
		return null;
	}

	private ResponseBaseVo calculateMaxBenefit(ResponseBaseVo vo) {
		log.info("상품 쿠폰 최대혜택 계산");
		return null;
	}

	@Override
	public ResponseBaseVo getCalculationData() {
		log.info("PriceDiscountCalculation getCalculationData call");
		getAvailablePromotionData(this.reqVo);
		calculateDcAmt(this.reqVo, null);
		calculateMaxBenefit(null);
		return null;
	}

}
