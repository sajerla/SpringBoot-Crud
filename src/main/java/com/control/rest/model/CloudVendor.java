package com.control.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloud_vendor_info")
public class CloudVendor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String vendorId;
	private String VendorName;
	private String vendorAddress;
	private String vendorPhoneNumber;
	
	
	public String getVendorId() {
		return vendorId;
	}


	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}


	public String getVendorName() {
		return VendorName;
	}


	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}


	public String getVendorAddress() {
		return vendorAddress;
	}


	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}


	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}


	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}


	public CloudVendor() {
		super();
	}


	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
		super();
		this.vendorId = vendorId;
		VendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	

}
