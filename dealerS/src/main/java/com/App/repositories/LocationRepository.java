package com.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.App.models.Location;

@Repository
public interface LocationRepository extends JpaRepository <Location, Integer> {

}
