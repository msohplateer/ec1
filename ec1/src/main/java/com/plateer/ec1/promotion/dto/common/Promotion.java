package com.plateer.ec1.promotion.dto.common;

import lombok.Data;

@Data
public class Promotion {
	private Long promotionNo;
	private String cpnKindCd;
	private Long couponIssueNo;
	private String degrCcd;
	private Long dcAmt;
	private String maxBenefitYn;
}
