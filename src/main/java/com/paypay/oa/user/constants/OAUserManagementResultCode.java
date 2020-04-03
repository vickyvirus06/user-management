package com.paypay.oa.user.constants;

import com.paypay.oa.user.controller.response.ResultInfoDto;

import lombok.Getter;

@Getter
public class OAUserManagementResultCode {

	 public static final ResultInfoDto OA_USER_GENERAL_EXCEPTION = new ResultInfoDto("24000001", "INTERNAL_SERVER_ERROR", "Something went wrong on User Ahead service side");
    // ERROR related to POST /v1/order/consumer/{consumerId}
    public static final ResultInfoDto SEARCH_QUERY_MISSING_ERROR = new ResultInfoDto("24001001", "SEARCH_QUERY_MISSING_ERROR", "Please Provide Search Query");


    // SUCCESS
    public static final ResultInfoDto API_SUCCESS = new ResultInfoDto("24000000", "SUCCESS", "Request Successfully fulfilled.");
}
