package com.plateer.ec1.promotion.calculator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.plateer.ec1.promotion.dto.common.CouponProductDto;
import com.plateer.ec1.promotion.dto.common.ProductCouponDto;
import com.plateer.ec1.promotion.dto.common.Promotion;
import com.plateer.ec1.promotion.dto.request.RequestPromotionDto;
import com.plateer.ec1.promotion.dto.response.ResponseBaseDto;
import com.plateer.ec1.promotion.dto.response.ResponseProductCouponDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductCouponCalculator implements Calculator{
	
	private RequestPromotionDto reqVo;
	
	public ProductCouponCalculator(RequestPromotionDto reqVo){
		this.reqVo = reqVo;
	}
	
	private Promotion getAvailablePromotionData(RequestPromotionDto reqVo) {
		log.info("적용 가능 상품 쿠폰 데이터 조회");
		
		Promotion promotion = new Promotion();
		
		promotion.setCouponIssueNo(100L);
		promotion.setDcAmt(1000L);
		promotion.setPromotionNo(1L);
		
		return promotion;
	}

	private ResponseProductCouponDto calculateDcAmt(RequestPromotionDto reqVo, Promotion prm) {
		log.info("상품 쿠폰 할인 적용 금액 계산");
		ProductCouponDto pcVo = new ProductCouponDto();
		List promotionList = new ArrayList();
		
		promotionList.add(prm);
		pcVo.setMaxBenefitYn("Y");
		pcVo.setProduct(reqVo.getProductList().get(0));
		pcVo.setPromotionList(promotionList);
		
		ResponseProductCouponDto rpcVo = new ResponseProductCouponDto();
		List productPromotionList = new ArrayList();
		
		productPromotionList.add(pcVo);
		
		rpcVo.setMemberNo(reqVo.getMemberNo());
		rpcVo.setProductPromotionList(productPromotionList);
		
		return rpcVo;
	}

	private ResponseProductCouponDto calculateMaxBenefit(ResponseProductCouponDto vo) {
		log.info("상품 쿠폰 최대혜택 계산");
		return vo;
	}

	@Override
	public ResponseBaseDto getCalculationData() {
		log.info("PriceDiscountCalculation getCalculationData call");
		Promotion promotion = getAvailablePromotionData(this.reqVo);
		ResponseProductCouponDto vo = calculateDcAmt(this.reqVo, promotion);
		ResponseProductCouponDto resVo = calculateMaxBenefit(vo);
		return resVo;
	}

}
