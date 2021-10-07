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

import com.App.models.VehicleMaintenance;
import com.App.services.SupplierService;
import com.App.services.VehicleMaintenanceService;
import com.App.services.VehicleService;



@Controller
public class VehicleMaintenanceController {

	@Autowired private VehicleMaintenanceService vehicleMaintenanceService;
	@Autowired private VehicleService vehicleService;
	@Autowired private SupplierService supplierService;

	
	@GetMapping("/vehiclemaintenances")
	public String findAll(Model model) {
		
		model.addAttribute("vehiclemaintenances", vehicleMaintenanceService.findAll());	
		model.addAttribute("vehicles", vehicleService.findAll());
		model.addAttribute("suppliers", supplierService.findAll());
		
		return "VehicleMaintenance";
	}
	
	@RequestMapping("vehiclemaintenances/findById")
	@ResponseBody
	public Optional<VehicleMaintenance> findById(Integer id){
		return vehicleMaintenanceService.findById(id);
	}
	
	@PostMapping("/vehiclemaintenances/addNew")
	public String addNew(VehicleMaintenance vehicleMaintenance) {
		vehicleMaintenanceService.save(vehicleMaintenance);
		return "redirect:/vehiclemaintenances";
	}
	
	@RequestMapping(value="vehiclemaintenances/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleMaintenance vehicleMaintenance) {
		vehicleMaintenanceService.save(vehicleMaintenance);
		return "redirect:/vehiclemaintenances";
	}
	
	@RequestMapping(value="vehiclemaintenances/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		vehicleMaintenanceService.delete(id);
		return "redirect:/vehiclemaintenances";
	}

}
