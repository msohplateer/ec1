package com.plateer.ec1.promotion.service.impl;

import org.springframework.stereotype.Service;

import com.plateer.ec1.promotion.calculator.Calculator;
import com.plateer.ec1.promotion.data.PromotionType;
import com.plateer.ec1.promotion.dto.request.RequestPromotionDto;
import com.plateer.ec1.promotion.dto.response.ResponseCartCouponDto;
import com.plateer.ec1.promotion.dto.response.ResponsePriceDiscountDto;
import com.plateer.ec1.promotion.dto.response.ResponseProductCouponDto;
import com.plateer.ec1.promotion.factory.CalculationFactory;
import com.plateer.ec1.promotion.service.PromotionService;

@Service
public class PromotionServiceImpl implements PromotionService{
	
	CalculationFactory factory = new CalculationFactory();
	
	@Override
	public ResponsePriceDiscountDto getPriceDiscountApplyData(RequestPromotionDto rpVo) {
		Calculator calculation = factory.getPromotionCalculationData(rpVo, PromotionType.PRC_DC);
		return (ResponsePriceDiscountDto)calculation.getCalculationData(); 
	}

	@Override
	public ResponseProductCouponDto getProductCouponApplyData(RequestPromotionDto rpVo) {
		Calculator calculation = factory.getPromotionCalculationData(rpVo, PromotionType.PRD_CUP);
		return (ResponseProductCouponDto)calculation.getCalculationData(); 
	}

	@Override
	public ResponseCartCouponDto getCartCouponApplyData(RequestPromotionDto rpVo) {
		Calculator calculation = factory.getPromotionCalculationData(rpVo, PromotionType.CART_CUP);
		return (ResponseCartCouponDto) calculation.getCalculationData(); 
	}

}
