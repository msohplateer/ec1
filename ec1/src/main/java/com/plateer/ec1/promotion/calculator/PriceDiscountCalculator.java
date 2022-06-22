package com.plateer.ec1.promotion.calculator;

import org.springframework.stereotype.Component;

import com.plateer.ec1.promotion.data.PromotionType;
import com.plateer.ec1.promotion.dto.common.Promotion;
import com.plateer.ec1.promotion.dto.request.PromotionRequestDto;
import com.plateer.ec1.promotion.dto.response.BaseResponseDto;
import com.plateer.ec1.promotion.dto.response.PriceDiscountResponseDto;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PriceDiscountCalculator implements Calculator{
	
	@Override
	public PromotionType getType() {
		return PromotionType.PRC_DC;
	}
	
	private Promotion getAvailablePromotionData(PromotionRequestDto reqVo) {
		log.info("적용 가능 가격 할인 금액 데이터 조회");
		return new Promotion();
	}

	private PriceDiscountResponseDto calculateDcAmt(PromotionRequestDto reqVo, Promotion prm) {
		log.info("가격 할인 적용 금액 계산");
		PriceDiscountResponseDto rpdVo = new PriceDiscountResponseDto();
		rpdVo.setMemberNo(reqVo.getMemberNo());
		rpdVo.setProductList(reqVo.getProductList());
		return rpdVo;
	}


	@Override
	public BaseResponseDto getCalculationData(PromotionRequestDto prDto) {
		log.info("ResponseBaseVo getCalculationData call");
		Promotion promotion = getAvailablePromotionData(prDto);
		PriceDiscountResponseDto resVo = calculateDcAmt(prDto, promotion);
		return resVo;
	}

	
}
