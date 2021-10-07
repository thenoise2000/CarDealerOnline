package com.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.App.models.InvoiceStatus;

@Repository
public interface InvoiceStatusRepository extends JpaRepository <InvoiceStatus, Integer> {

}
