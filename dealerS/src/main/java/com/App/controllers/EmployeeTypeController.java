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

import com.App.models.EmployeeType;
import com.App.services.EmployeeTypeService;

@Controller
public class EmployeeTypeController {

@Autowired 
private EmployeeTypeService employeeTypeService;
	
	//Get All EmployeeTypes
	@GetMapping("employeetypes")
	public String findAll(Model model){		
		model.addAttribute("employeetypes", employeeTypeService.findAll());
		return "EmployeeType";
	}	
	
	@RequestMapping("employeetypes/findById") 
	@ResponseBody
	public Optional<EmployeeType> findById(Integer id)
	{
		return employeeTypeService.findById(id);
	}
	
	//Add EmployeeType
	@PostMapping(value="employeetypes/addNew")
	public String addNew(EmployeeType employeeType) {
		employeeTypeService.save(employeeType);
		return "redirect:/employeetypes";
	}	
	
	@RequestMapping(value="employeetypes/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(EmployeeType employeeType) {
		employeeTypeService.save(employeeType);
		return "redirect:/employeetypes";
	}
	
	@RequestMapping(value="employeetypes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		employeeTypeService.delete(id);
		return "redirect:/employeetypes";
	}


}
