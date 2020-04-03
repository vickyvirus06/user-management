package com.paypay.oa.user.util;

import com.paypay.oa.user.constants.OAUserManagementResultCode;
import com.paypay.oa.user.controller.response.GenericServerResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {
    public static <T> ResponseEntity<GenericServerResponse> getSuccessResponse(T data) {
        return ResponseEntity.status(HttpStatus.OK).body(genericSuccessResponse(data));
    }

    private static <T> GenericServerResponse<T> genericSuccessResponse(T data) {
        return new GenericServerResponse(OAUserManagementResultCode.API_SUCCESS, data);
    }
}
