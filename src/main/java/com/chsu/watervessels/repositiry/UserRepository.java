package com.chsu.watervessels.repositiry;

import com.chsu.watervessels.entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ApplicationUser, Long> {
}
