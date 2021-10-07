package com.App.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.App.models.InvoiceStatus;
import com.App.services.InvoiceStatusService;

@Controller
public class InvoiceStatusController {

@Autowired 
private InvoiceStatusService invoiceStatusService;
	
	//Get All InvoiceStatuss
	@GetMapping("invoicestatus")
	public String findAll(Model model){		
		model.addAttribute("invoicestatus", invoiceStatusService.findAll());
		return "invoicestatus";
	}	
	
	@RequestMapping("invoicestatus/findById") 
	@ResponseBody
	public Optional<InvoiceStatus> findById(Integer id)
	{
		return invoiceStatusService.findById(id);
	}
	
	//Add InvoiceStatus
	@PostMapping(value="invoicestatus/addNew")
	public String addNew(InvoiceStatus invoiceStatus) {
		invoiceStatusService.save(invoiceStatus);
		return "redirect:/invoicestatus";
	}	
	
	@RequestMapping(value="invoicestatus/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(InvoiceStatus invoiceStatus) {
		invoiceStatusService.save(invoiceStatus);
		return "redirect:/invoicestatus";
	}
	
	@RequestMapping(value="invoicestatus/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		invoiceStatusService.delete(id);
		return "redirect:/invoicestatus";
	}

}
