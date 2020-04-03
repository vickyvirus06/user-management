package com.paypay.oa.user.exception;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

import com.paypay.oa.user.constants.OAUserManagementResultCode;
import com.paypay.oa.user.controller.response.ResultInfoDto;

@Data
@EqualsAndHashCode(callSuper = false)
public class OAUserManagementException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    protected ResultInfoDto resultInfoDto = OAUserManagementResultCode.OA_USER_GENERAL_EXCEPTION;
    protected HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

    public OAUserManagementException() {
        super();
    }

    public OAUserManagementException(String msg) {
        super(msg);
    }

    public OAUserManagementException(HttpStatus status, String msg) {
        super(msg);
        this.status = status;
    }

    public OAUserManagementException(HttpStatus status, String msg, ResultInfoDto resultInfoDto) {
        super(msg);
        this.resultInfoDto = resultInfoDto;
        this.status = status;
    }

    public OAUserManagementException(ResultInfoDto resultInfoDto) {
        super();
        this.resultInfoDto = resultInfoDto;
    }

    public OAUserManagementException(HttpStatus status, ResultInfoDto resultInfoDto) {
        super();
        this.resultInfoDto = resultInfoDto;
        this.status = status;
    }

    public OAUserManagementException(ResultInfoDto resultInfoDto, String message) {
        super();
        this.resultInfoDto = resultInfoDto;
    }
}
