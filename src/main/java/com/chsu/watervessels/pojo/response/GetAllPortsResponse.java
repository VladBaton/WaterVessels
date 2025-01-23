package com.chsu.watervessels.pojo.response;

import com.chsu.watervessels.pojo.Port;
import lombok.Data;

import java.util.List;

@Data
public class GetAllPortsResponse extends BaseResponse {

    private List<Port> portList;

}
