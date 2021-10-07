package com.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.App.models.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository <Invoice, Integer> {

}
