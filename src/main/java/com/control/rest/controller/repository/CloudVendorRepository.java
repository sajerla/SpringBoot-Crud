package com.control.rest.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.control.rest.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>
{
	
}
