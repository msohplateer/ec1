package com.plateer.ec1.promotion.calculator;

import com.plateer.ec1.promotion.data.PromotionType;
import com.plateer.ec1.promotion.dto.common.Promotion;
import com.plateer.ec1.promotion.dto.request.PromotionRequestDto;
import com.plateer.ec1.promotion.dto.response.BaseResponseDto;

public interface Calculator {
	PromotionType getType();
	public BaseResponseDto getCalculationData(PromotionRequestDto prDto);
}
