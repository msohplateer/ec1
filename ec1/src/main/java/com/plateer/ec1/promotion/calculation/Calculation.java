package com.plateer.ec1.promotion.calculation;

import com.plateer.ec1.promotion.vo.common.Promotion;
import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseBaseVo;

public interface Calculation {
	public ResponseBaseVo getCalculationData();
}
