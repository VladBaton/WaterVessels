package com.chsu.watervessels.exceptionhandler;

import com.chsu.watervessels.pojo.response.BaseResponse;
import com.chsu.watervessels.pojo.response.Status;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ResponseEntity<BaseResponse> handleGeneralException(Exception ex) {
        BaseResponse response = new BaseResponse();
        Status status = new Status();
        status.setStatusCode(400L);
        status.setStatusDescription(ex.toString());
        response.setStatus(status);
        return ResponseEntity.badRequest().body(response);
    }
}
