package com.paypay.oa.user.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paypay.oa.user.application.UserApplication;
import com.paypay.oa.user.controller.request.search.AddSearchDetailsRequest;
import com.paypay.oa.user.controller.response.GenericServerResponse;
import com.paypay.oa.user.util.ResponseUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@Validated
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Api(tags = "Order")
public class UserController {
    private final UserApplication orderApplication;

    @PostMapping(
            value = "/v1/userManagement/addSearchQuery/consumer/{consumerId}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(
            value = "Add an search query",
            notes = "Add an search query based on consumer id.")
    public ResponseEntity<GenericServerResponse> addOrder(
            @RequestBody @Valid AddSearchDetailsRequest addSearchDetailsRequest,
            @PathVariable("consumerId") Long consumerId) {
        return ResponseUtil.getSuccessResponse(orderApplication.addSearch(addSearchDetailsRequest, consumerId));
    }
    
    /**
     * Add order and its items
     *
     * @param addOrderDetailsRequest
     * @param consumerId
     * @return ResponseEntity<GenericServerResponse>
     */

    @GetMapping(value = "/v1/userManagement/searchHistory/consumer/{consumerId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Get order list for a store.", notes = "Get order list for a store.")
    public ResponseEntity<GenericServerResponse> getOrderList(
            @PathVariable Long consumerId) {
        return ResponseUtil.getSuccessResponse(orderApplication.getSearchHistory(consumerId));
    }
    
    
    
}
