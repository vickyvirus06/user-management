package com.paypay.oa.user.controller.response;

import lombok.Value;

@Value
public class ErrorResource {
    private String status;
    private String statusCode;
    private String statusMessage;
}
