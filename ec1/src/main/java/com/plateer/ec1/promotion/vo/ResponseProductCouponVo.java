package com.plateer.ec1.promotion.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ResponseProductCouponVo extends ResponseBaseVo{
	private String memberNo;
	private List<ProductCouponVo> productPromotionList;
}
