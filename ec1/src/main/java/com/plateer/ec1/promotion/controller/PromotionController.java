package com.plateer.ec1.promotion.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plateer.ec1.promotion.service.PromotionService;
import com.plateer.ec1.promotion.vo.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.ResponseCartCouponVo;
import com.plateer.ec1.promotion.vo.ResponsePriceDiscountVo;
import com.plateer.ec1.promotion.vo.ResponseProductCouponVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/promotion")
public class PromotionController {
	
	@Autowired
	PromotionService promotionService;
	
	@GetMapping("/getPriceDiscountApplyInfo")
	public ResponsePriceDiscountVo getPriceDiscountApplyData(HttpServletRequest request) {
		log.info("getPriceDiscountApplyInfo controller call");
		ResponsePriceDiscountVo rpdVo = promotionService.getPriceDiscountApplyData(null);
		return rpdVo;
	}
	
	@GetMapping("/getProductCouponApplyInfo")
	public ResponseProductCouponVo getProductCouponApplyData(HttpServletRequest request) {
		log.info("getProductCouponApplyInfo controller call");
		ResponseProductCouponVo rpcVo = promotionService.getProductCouponApplyData(null);
		return rpcVo;
	}
	
	@GetMapping("/getCartCouponApplyInfo")
	public ResponseCartCouponVo getCartCouponApplyData(HttpServletRequest request) {
		log.info("getCartCouponApplyInfo controller call");
		ResponseCartCouponVo rccVo = promotionService.getCartCouponApplyData(null);
		return rccVo;
	}
}
