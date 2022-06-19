package com.plateer.ec1.promotion.factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.plateer.ec1.promotion.calculator.Calculator;
import com.plateer.ec1.promotion.calculator.CartCouponCalculator;
import com.plateer.ec1.promotion.calculator.PriceDiscountCalculator;
import com.plateer.ec1.promotion.calculator.ProductCouponCalculator;
import com.plateer.ec1.promotion.data.PromotionType;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseBaseVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalculationFactory {
	public Calculator getPromotionCalculationData(RequestPromotionVo rqpVo, PromotionType type) {
		log.info("CalulationFactory call");
		switch(type) {
			case PRC_DC:
				return (Calculator) new PriceDiscountCalculator(rqpVo);
			case PRD_CUP:
				return (Calculator) new ProductCouponCalculator(rqpVo);
			case CART_CUP:
				return (Calculator) new CartCouponCalculator(rqpVo);
			default:
				return null;
		}
	}
}
