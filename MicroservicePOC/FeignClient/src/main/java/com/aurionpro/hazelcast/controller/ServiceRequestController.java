package com.aurionpro.hazelcast.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.hazelcast.service.SelfServiceRequestBO;
import com.aurionpro.hazelcast.service.ServiceRequestService;


@RestController("com.interfaces.controller.ServiceRequestController")
@RequestMapping("/servicerequestcontroller")
public class ServiceRequestController {
    
	
	private static final Logger log = LoggerFactory.getLogger(ServiceRequestController.class);
	
	@Autowired
	ServiceRequestService serviceRequestService;
	
	@GetMapping("/getAllServiceRequest")
	public List<SelfServiceRequestBO> getAllServiceRequest() {
		log.debug("In Find all");
	    List<SelfServiceRequestBO> findAll = serviceRequestService.findAll();
		return findAll;
	}
	
	@GetMapping("/getServiceRequestById/{id}")
	public Optional<SelfServiceRequestBO> getServiceRequestById(@PathVariable(value = "id") Long serviceRequestId) {
		log.debug("In Find getServiceRequestById");
	    return serviceRequestService.getServiceRequestById(serviceRequestId);
	           /// .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
	}
	
}
