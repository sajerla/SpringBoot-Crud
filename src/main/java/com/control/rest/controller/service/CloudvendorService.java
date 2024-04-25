package com.control.rest.controller.service;

import java.util.List;

import com.control.rest.model.CloudVendor;

public interface CloudvendorService 
{
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String cloudVendorId);
	public CloudVendor getCloudvendor(String cloudVendorId);
	
	public List<CloudVendor> getAllCloudVendors();

}
