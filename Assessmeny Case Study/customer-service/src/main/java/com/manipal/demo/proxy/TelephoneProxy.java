package com.manipal.demo.proxy;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.demo.model.Telephone;

//@FeignClient(name="zuul-api-gateway")
//@RibbonClient(name="capital-service")
@FeignClient(name="telephone-service", url = "localhost:8001")
public interface TelephoneProxy {

	@GetMapping("{customerId}/telephone")
	public Telephone retrieveTelephone(@PathVariable String customerId);

}