package com.chsu.watervessels.pojo.response;

import com.chsu.watervessels.pojo.Port;
import lombok.Data;

@Data
public class CreatePortResponse extends BaseResponse {

    Port createdPort;
}
