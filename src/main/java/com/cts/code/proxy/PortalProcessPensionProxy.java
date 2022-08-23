package com.cts.code.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.code.entity.PensionDetail;


@FeignClient(name="processpension",url="localhost:8090")
public interface PortalProcessPensionProxy {
	
	@PostMapping("/process-pension/{adharCard}")
	public PensionDetail getValue(@RequestHeader(name="Authorization") String token, @PathVariable("adharCard") Long adharCard);

}
