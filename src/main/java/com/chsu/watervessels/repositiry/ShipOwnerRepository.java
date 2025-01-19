package com.chsu.watervessels.repositiry;

import com.chsu.watervessels.entity.ShipOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipOwnerRepository extends JpaRepository<ShipOwner, Long> {
}
