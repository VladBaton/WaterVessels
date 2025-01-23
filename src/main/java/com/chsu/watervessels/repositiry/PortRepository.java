package com.chsu.watervessels.repositiry;

import com.chsu.watervessels.entity.Port;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortRepository extends JpaRepository<Port, Long> {

    Port findPortByPortName(String portName);
}
