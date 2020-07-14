package com.aurionpro.hazelcast.service;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Service
@FeignClient(name="SERVICEREQUEST-CLIENT")
public interface ServiceRequestService {
	
	 @RequestMapping("/servicerequest/find/{id}")
	 Optional<SelfServiceRequestBO> getServiceRequestById(@PathVariable(value="id") Long  id);
	 
	  @RequestMapping("/servicerequestcontroller/getAllServiceRequest")
	   public List<SelfServiceRequestBO> findAll();


}
