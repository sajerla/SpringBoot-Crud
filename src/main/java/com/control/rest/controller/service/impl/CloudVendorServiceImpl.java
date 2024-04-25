package com.control.rest.controller.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.control.rest.controller.repository.CloudVendorRepository;
import com.control.rest.controller.service.CloudvendorService;
import com.control.rest.model.CloudVendor;

@Service

public class CloudVendorServiceImpl implements CloudvendorService
{
	CloudVendorRepository cloudVendorRepository;

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "created";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		
		//more logic we can add here...
		cloudVendorRepository.save(cloudVendor);
		return "updated";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);;
		return "deleted";
	}

	@Override
	public CloudVendor getCloudvendor(String cloudVendorId) {
		return cloudVendorRepository.findById(cloudVendorId).get();
		
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		//more logic we can add here...
		return cloudVendorRepository.findAll();
	}
	


}
