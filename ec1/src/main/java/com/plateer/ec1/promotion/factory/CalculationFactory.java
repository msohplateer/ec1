package com.plateer.ec1.promotion.factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.calculation.CartCouponCalculation;
import com.plateer.ec1.promotion.calculation.PriceDiscountCalculation;
import com.plateer.ec1.promotion.calculation.ProductCouponCalculation;
import com.plateer.ec1.promotion.data.PromotionType;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseBaseVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalculationFactory {
	public Calculation getPromotionCalculationData(RequestPromotionVo rqpVo, PromotionType type) {
		log.info("CalulationFactory call");
		switch(type) {
			case PRC_DC:
				return (Calculation) new PriceDiscountCalculation(rqpVo);
			case PRD_CUP:
				return (Calculation) new ProductCouponCalculation(rqpVo);
			case CART_CUP:
				return (Calculation) new CartCouponCalculation(rqpVo);
			default:
				return null;
		}
	}
}
