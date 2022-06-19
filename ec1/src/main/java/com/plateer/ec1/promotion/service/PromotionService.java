package com.plateer.ec1.promotion.service;

import com.plateer.ec1.promotion.vo.request.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.response.ResponseCartCouponVo;
import com.plateer.ec1.promotion.vo.response.ResponsePriceDiscountVo;
import com.plateer.ec1.promotion.vo.response.ResponseProductCouponVo;

public interface PromotionService {
	public ResponsePriceDiscountVo getPriceDiscountApplyData(RequestPromotionVo rpVo);
	public ResponseProductCouponVo getProductCouponApplyData(RequestPromotionVo rpVo);
	public ResponseCartCouponVo getCartCouponApplyData(RequestPromotionVo rpVo);
}
