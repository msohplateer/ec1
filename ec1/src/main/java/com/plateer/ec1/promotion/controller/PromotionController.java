package com.plateer.ec1.promotion.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.plateer.ec1.promotion.service.PromotionService;
import com.plateer.ec1.promotion.vo.common.Product;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseCartCouponVo;
import com.plateer.ec1.promotion.vo.response.ResponsePriceDiscountVo;
import com.plateer.ec1.promotion.vo.response.ResponseProductCouponVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/promotion")
@RequiredArgsConstructor
public class PromotionController {
	
	private final PromotionService promotionService;
	
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, value = "/getPriceDiscountApplyInfo")
	public ResponsePriceDiscountVo getPriceDiscountApplyData(@RequestBody RequestPromotionVo rpVo) {
		log.info("getPriceDiscountApplyInfo controller call request data :" + rpVo);
		ResponsePriceDiscountVo rpdVo = promotionService.getPriceDiscountApplyData(rpVo);
		return rpdVo; 
	}
	
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, value = "/getProductCouponApplyInfo")
	public ResponseProductCouponVo getProductCouponApplyData(@RequestBody RequestPromotionVo rpVo) {
		log.info("getProductCouponApplyInfo controller call request data :" + rpVo);
		ResponseProductCouponVo rpcVo = promotionService.getProductCouponApplyData(rpVo);
		return rpcVo; 
	}
	
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, value = "/getCartCouponApplyInfo")
	public ResponseCartCouponVo getCartCouponApplyData(@RequestBody RequestPromotionVo rpVo) {
		ResponseCartCouponVo rccVo = promotionService.getCartCouponApplyData(rpVo);
		return rccVo; 
	}
}
