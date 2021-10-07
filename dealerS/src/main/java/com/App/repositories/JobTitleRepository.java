package com.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.App.models.JobTitle;

@Repository
public interface JobTitleRepository extends JpaRepository <JobTitle, Integer> {

}
