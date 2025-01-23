package com.chsu.watervessels.pojo.response;

import lombok.Data;

import java.util.Date;

@Data
public class BaseResponse {

    private String rsUID;

    private Date rsTm;

    private Status status;
    
    public BaseResponse() {
        rsUID = java.util.UUID.randomUUID().toString();
        rsTm = new Date();
        status = new Status();
        status.setStatusCode(0L);
        status.setStatusDescription("Обработан успешно");
    }
}
