package com.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.App.models.State;

@Repository
public interface StateRepository extends JpaRepository <State, Integer> {

}
