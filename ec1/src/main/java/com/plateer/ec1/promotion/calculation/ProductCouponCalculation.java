package com.plateer.ec1.promotion.calculation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.plateer.ec1.promotion.vo.CouponProductVo;
import com.plateer.ec1.promotion.vo.ProductCouponVo;
import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.ResponseBaseVo;
import com.plateer.ec1.promotion.vo.ResponseProductCouponVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductCouponCalculation implements Calculation{
	private RequestPromotionVo reqVo;
	public ProductCouponCalculation(RequestPromotionVo reqVo){
		this.reqVo = reqVo;
	}
	private Promotion getAvailablePromotionData(RequestPromotionVo reqVo) {
		log.info("적용 가능 상품 쿠폰 데이터 조회");
		
		Promotion promotion = new Promotion();
		
		promotion.setCouponIssueNo(100L);
		promotion.setDcAmt(1000L);
		promotion.setPromotionNo(1L);
		
		return promotion;
	}

	private ResponseProductCouponVo calculateDcAmt(RequestPromotionVo reqVo, Promotion prm) {
		log.info("상품 쿠폰 할인 적용 금액 계산");
		ProductCouponVo pcVo = new ProductCouponVo();
		List promotionList = new ArrayList();
		
		promotionList.add(prm);
		pcVo.setMaxBenefitYn("Y");
		pcVo.setProduct(reqVo.getProductList().get(0));
		pcVo.setPromotionList(promotionList);
		
		ResponseProductCouponVo rpcVo = new ResponseProductCouponVo();
		List productPromotionList = new ArrayList();
		
		productPromotionList.add(pcVo);
		
		rpcVo.setMemberNo(reqVo.getMemberNo());
		rpcVo.setProductPromotionList(productPromotionList);
		
		return rpcVo;
	}

	private ResponseProductCouponVo calculateMaxBenefit(ResponseProductCouponVo vo) {
		log.info("상품 쿠폰 최대혜택 계산");
		return vo;
	}

	@Override
	public ResponseBaseVo getCalculationData() {
		log.info("PriceDiscountCalculation getCalculationData call");
		Promotion promotion = getAvailablePromotionData(this.reqVo);
		ResponseProductCouponVo vo = calculateDcAmt(this.reqVo, promotion);
		ResponseProductCouponVo resVo = calculateMaxBenefit(vo);
		return resVo;
	}

}
