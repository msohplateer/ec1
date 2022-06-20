package com.plateer.ec1.promotion.service;

import com.plateer.ec1.promotion.dto.request.RequestPromotionDto;
import com.plateer.ec1.promotion.dto.response.ResponseCartCouponDto;
import com.plateer.ec1.promotion.dto.response.ResponsePriceDiscountDto;
import com.plateer.ec1.promotion.dto.response.ResponseProductCouponDto;

public interface PromotionService {
	public ResponsePriceDiscountDto getPriceDiscountApplyData(RequestPromotionDto rpVo);
	public ResponseProductCouponDto getProductCouponApplyData(RequestPromotionDto rpVo);
	public ResponseCartCouponDto getCartCouponApplyData(RequestPromotionDto rpVo);
}
