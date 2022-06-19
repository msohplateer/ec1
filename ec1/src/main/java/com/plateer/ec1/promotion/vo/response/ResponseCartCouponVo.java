package com.plateer.ec1.promotion.vo.response;

import java.util.List;

import com.plateer.ec1.promotion.vo.common.CouponProductVo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ResponseCartCouponVo extends ResponseBaseVo{
	private String memberNo;
	private List<CouponProductVo> promotionProductList;
}
