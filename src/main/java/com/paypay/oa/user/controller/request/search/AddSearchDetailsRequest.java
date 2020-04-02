package com.paypay.oa.user.controller.request.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AddSearchDetailsRequest {
    @NotNull(message = "Consumer id must not be null")
    private Long consumerId;
    @NotNull(message = "Please provide the Search Query")
    private String searchQuery;
    }


