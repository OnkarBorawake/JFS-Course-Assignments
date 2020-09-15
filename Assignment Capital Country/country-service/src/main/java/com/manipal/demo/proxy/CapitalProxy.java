package com.manipal.demo.proxy;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.demo.model.Capital;

//@FeignClient(name="zuul-api-gateway")
//@RibbonClient(name="capital-service")
@FeignClient(name="capital-service", url = "localhost:8001")
public interface CapitalProxy {

	@GetMapping("{countryCode}/capital")
	public Capital retrieveCapital(@PathVariable String countryCode);

}