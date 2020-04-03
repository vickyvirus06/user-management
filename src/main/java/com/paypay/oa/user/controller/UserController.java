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
@Api(tags = "User")
public class UserController {
    private final UserApplication userApplication;

    /**
     * 
     * @param addSearchDetailsRequest
     * @param consumerId
     * @return
     */
    @PostMapping(
            value = "/v1/userManagement/addSearchQuery/consumer/{consumerId}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(
            value = "Add an search query",
            notes = "Add an search query based on consumer id.")
    public ResponseEntity<GenericServerResponse> addSearch(
            @RequestBody @Valid AddSearchDetailsRequest addSearchDetailsRequest,
            @PathVariable("consumerId") Long consumerId) {
        userApplication.addSearch(addSearchDetailsRequest, consumerId);
        return ResponseUtil.getSuccessResponse(null);
    }
    
    /**
     * 
     * @param consumerId
     * @return
     */
    @GetMapping(value = "/v1/userManagement/searchHistory/consumer/{consumerId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Get search list for a consumer.", notes = "Get search list for a consumer.")
    public ResponseEntity<GenericServerResponse> getSearchList(
            @PathVariable Long consumerId) {
        return ResponseUtil.getSuccessResponse(userApplication.getSearchHistory(consumerId));
    }
    
    /**
     * 
     * @param consumerId
     * @return
     */
    @GetMapping(value = "/v1/userManagement/consumer/searchTags", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Get tags list depending on time.", notes = "Get tag list for a time.")
    public ResponseEntity<GenericServerResponse> getTagList() {
        return ResponseUtil.getSuccessResponse(userApplication.getSearchTags());
    }


}
