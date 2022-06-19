package com.plateer.ec1.promotion.calculation;

import org.springframework.stereotype.Service;

import com.plateer.ec1.promotion.vo.common.Promotion;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseBaseVo;
import com.plateer.ec1.promotion.vo.response.ResponseCartCouponVo;
import com.plateer.ec1.promotion.vo.response.ResponsePriceDiscountVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PriceDiscountCalculation implements Calculation{
	
	private RequestPromotionVo reqVo;
	
	public PriceDiscountCalculation(RequestPromotionVo reqVo){
		this.reqVo = reqVo;
	}
	
	private Promotion getAvailablePromotionData(RequestPromotionVo reqVo) {
		log.info("적용 가능 가격 할인 금액 데이터 조회");
		return new Promotion();
	}

	private ResponsePriceDiscountVo calculateDcAmt(RequestPromotionVo reqVo, Promotion prm) {
		log.info("가격 할인 적용 금액 계산");
		ResponsePriceDiscountVo rpdVo = new ResponsePriceDiscountVo();
		rpdVo.setMemberNo(reqVo.getMemberNo());
		rpdVo.setProductList(reqVo.getProductList());
		return rpdVo;
	}


	@Override
	public ResponseBaseVo getCalculationData() {
		log.info("ResponseBaseVo getCalculationData call");
		Promotion promotion = getAvailablePromotionData(this.reqVo);
		ResponsePriceDiscountVo resVo = calculateDcAmt(this.reqVo, promotion);
		return resVo;
	}
}
