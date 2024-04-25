package com.control.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.control.rest.controller.service.CloudvendorService;
import com.control.rest.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")

public class CloudAPIService 

{
	CloudvendorService cloudVendorService;
	
	
	
	public CloudAPIService(CloudvendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}

	@GetMapping("{vendorID}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId")String VendorId)
	{
		return cloudVendorService.getCloudvendor(VendorId);
	}
	
	@GetMapping("{vendorID}")
	public List<CloudVendor> getAllCloudVendorDetails()
	{
		return cloudVendorService.getAllCloudVendors();
	}
	
	@PostMapping
	public String CreateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		cloudVendorService.createCloudVendor(cloudVendor);
		
		return  "cloud is creatd";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		cloudVendorService.updateCloudVendor(cloudVendor);
		
		return  "cloud is updated";
	}
	
	@DeleteMapping("{vendorID}")
	public String DeleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
	{
		cloudVendorService.deleteCloudVendor(vendorId);
		
		return  "cloud is deleted";
	}
	
}
