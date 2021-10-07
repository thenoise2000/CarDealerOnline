package com.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.App.models.Country;

@Repository
public interface CountryRepository extends JpaRepository <Country, Integer> {

}
