package com.chsu.watervessels.service;

import com.chsu.watervessels.repositiry.ShipOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OwnerService {

    @Autowired
    ShipOwnerRepository ownerRepository;
}
