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

import com.plateer.ec1.promotion.dto.common.Product;
import com.plateer.ec1.promotion.dto.request.RequestPromotionDto;
import com.plateer.ec1.promotion.dto.response.ResponseCartCouponDto;
import com.plateer.ec1.promotion.dto.response.ResponsePriceDiscountDto;
import com.plateer.ec1.promotion.dto.response.ResponseProductCouponDto;
import com.plateer.ec1.promotion.service.PromotionService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/promotion")
@RequiredArgsConstructor
public class PromotionController {
	
	private final PromotionService promotionService;
	
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, value = "/getPriceDiscountApplyInfo")
	public ResponsePriceDiscountDto getPriceDiscountApplyData(@RequestBody RequestPromotionDto rpVo) {
		log.info("getPriceDiscountApplyInfo controller call request data :" + rpVo);
		ResponsePriceDiscountDto rpdVo = promotionService.getPriceDiscountApplyData(rpVo);
		return rpdVo; 
	}
	
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, value = "/getProductCouponApplyInfo")
	public ResponseProductCouponDto getProductCouponApplyData(@RequestBody RequestPromotionDto rpVo) {
		log.info("getProductCouponApplyInfo controller call request data :" + rpVo);
		ResponseProductCouponDto rpcVo = promotionService.getProductCouponApplyData(rpVo);
		return rpcVo; 
	}
	
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, value = "/getCartCouponApplyInfo")
	public ResponseCartCouponDto getCartCouponApplyData(@RequestBody RequestPromotionDto rpVo) {
		ResponseCartCouponDto rccVo = promotionService.getCartCouponApplyData(rpVo);
		return rccVo; 
	}
}
