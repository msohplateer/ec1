package com.plateer.ec1.promotion.calculation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.plateer.ec1.promotion.vo.CouponProductVo;
import com.plateer.ec1.promotion.vo.ProductCouponVo;
import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.ResponseBaseVo;
import com.plateer.ec1.promotion.vo.ResponseCartCouponVo;
import com.plateer.ec1.promotion.vo.ResponseProductCouponVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CartCouponCalculation implements Calculation{
	private RequestPromotionVo reqVo = null;
	public CartCouponCalculation(RequestPromotionVo reqVo){
		this.reqVo = reqVo;
	}

	private Promotion getAvailablePromotionData(RequestPromotionVo reqVo) {
		log.info("적용 가능 장바구니 쿠폰 데이터 조회");
		
		Promotion promotion = new Promotion();
		
		promotion.setCouponIssueNo(100L);
		promotion.setDcAmt(1000L);
		promotion.setPromotionNo(1L);
		
		return new Promotion();
	}

	private ResponseCartCouponVo calculateDcAmt(RequestPromotionVo reqVo, Promotion prm) {
		log.info("장바구니 쿠폰 할인 적용 금액 계산");
		CouponProductVo cpVo = new CouponProductVo();
		List couponList = new ArrayList();
		
		cpVo.setMaxBenefitYn("Y");
		cpVo.setProductList(reqVo.getProductList());
		cpVo.setPromotion(prm);
		
		ResponseCartCouponVo rpcVo = new ResponseCartCouponVo();
		List productPromotionList = new ArrayList();
		
		productPromotionList.add(cpVo);
		
		rpcVo.setMemberNo(reqVo.getMemberNo());
		rpcVo.setPromotionProductList(productPromotionList);
		
		return rpcVo;
	}

	private ResponseCartCouponVo calculateMaxBenefit(ResponseCartCouponVo vo) {
		log.info("장바구니 쿠폰 최대혜택 계산");
		return vo;
	}

	@Override
	public ResponseBaseVo getCalculationData() {
		log.info("CartCouponCalculation getCalculationData call");
		Promotion promotion = getAvailablePromotionData(this.reqVo);
		ResponseCartCouponVo vo = calculateDcAmt(this.reqVo, promotion);
		ResponseCartCouponVo resVo = calculateMaxBenefit(vo);
		return resVo;
	}

	
}
