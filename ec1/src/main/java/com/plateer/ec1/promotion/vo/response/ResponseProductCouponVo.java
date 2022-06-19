package com.plateer.ec1.promotion.vo.response;

import java.util.List;

import com.plateer.ec1.promotion.vo.common.ProductCouponVo;

import lombok.Data;

@Data
public class ResponseProductCouponVo extends ResponseBaseVo{
	private String memberNo;
	private List<ProductCouponVo> productPromotionList;
}
