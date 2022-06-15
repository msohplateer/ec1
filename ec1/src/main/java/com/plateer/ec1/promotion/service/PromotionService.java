package com.plateer.ec1.promotion.service;

import com.plateer.ec1.promotion.vo.RequestPromotionVo;
import com.plateer.ec1.promotion.vo.ResponseCartCouponVo;
import com.plateer.ec1.promotion.vo.ResponsePriceDiscountVo;
import com.plateer.ec1.promotion.vo.ResponseProductCouponVo;

public interface PromotionService {
	public ResponsePriceDiscountVo getPriceDiscountApplyData(RequestPromotionVo rpVo);
	public ResponseProductCouponVo getProductCouponApplyData(RequestPromotionVo rpVo);
	public ResponseCartCouponVo getCartCouponApplyData(RequestPromotionVo rpVo);
}
