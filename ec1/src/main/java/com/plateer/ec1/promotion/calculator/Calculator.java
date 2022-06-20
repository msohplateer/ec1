package com.plateer.ec1.promotion.calculator;

import com.plateer.ec1.promotion.dto.common.Promotion;
import com.plateer.ec1.promotion.dto.request.RequestPromotionDto;
import com.plateer.ec1.promotion.dto.response.ResponseBaseDto;

public interface Calculator {
	public ResponseBaseDto getCalculationData();
}
