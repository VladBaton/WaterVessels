package com.chsu.watervessels.repositiry;

import com.chsu.watervessels.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Country findCountryByCountryName(String countryName);
}
