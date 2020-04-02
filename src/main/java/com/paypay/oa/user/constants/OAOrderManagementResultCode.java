package com.paypay.oa.user.constants;

import com.paypay.oa.user.controller.response.ResultInfoDto;

import lombok.Getter;

@Getter
public class OAOrderManagementResultCode {

    // ERROR related to POST /v1/order/consumer/{consumerId}
    public static final ResultInfoDto SEARCH_QUERY_MISSING_ERROR = new ResultInfoDto("24001002", "SEARCH_QUERY_MISSING_ERROR", "Order already exists, Please provide the order id");


    // SUCCESS
    public static final ResultInfoDto API_SUCCESS = new ResultInfoDto("24000000", "SUCCESS", "Request Successfully fulfilled.");
}
