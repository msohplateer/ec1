package com.plateer.ec1.promotion.service.impl;

import org.springframework.stereotype.Service;

import com.plateer.ec1.promotion.calculator.Calculator;
import com.plateer.ec1.promotion.data.PromotionType;
import com.plateer.ec1.promotion.factory.CalculationFactory;
import com.plateer.ec1.promotion.service.PromotionService;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseCartCouponVo;
import com.plateer.ec1.promotion.vo.response.ResponsePriceDiscountVo;
import com.plateer.ec1.promotion.vo.response.ResponseProductCouponVo;

@Service
public class PromotionServiceImpl implements PromotionService{
	
	CalculationFactory factory = new CalculationFactory();
	
	@Override
	public ResponsePriceDiscountVo getPriceDiscountApplyData(RequestPromotionVo rpVo) {
		Calculator calculation = factory.getPromotionCalculationData(rpVo, PromotionType.PRC_DC);
		return (ResponsePriceDiscountVo)calculation.getCalculationData(); 
	}

	@Override
	public ResponseProductCouponVo getProductCouponApplyData(RequestPromotionVo rpVo) {
		Calculator calculation = factory.getPromotionCalculationData(rpVo, PromotionType.PRD_CUP);
		return (ResponseProductCouponVo)calculation.getCalculationData(); 
	}

	@Override
	public ResponseCartCouponVo getCartCouponApplyData(RequestPromotionVo rpVo) {
		Calculator calculation = factory.getPromotionCalculationData(rpVo, PromotionType.CART_CUP);
		return (ResponseCartCouponVo) calculation.getCalculationData(); 
	}

}
