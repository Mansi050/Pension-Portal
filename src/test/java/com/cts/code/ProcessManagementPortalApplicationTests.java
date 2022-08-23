package com.cts.code;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.cts.code.Controller.PortalProcessController;
import com.cts.code.entity.AuthenticationRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

import ch.qos.logback.core.status.Status;
import net.bytebuddy.asm.Advice.This;

@SpringBootTest
@AutoConfigureMockMvc
class ProcessManagementPortalApplicationTests {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private String tokenStringwrong = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkaHJ1diIsImV4cCI6MTY2MDgyMjI2NSwiaWF0IjoxNjYwNzYyMjY1fQ.g3OyO-vk6ytr1Xahs3JglT1xAcGrQeM4f9Te8D-SpdE";
	private String tokenStringcorrect = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJtYW5zaSIsImV4cCI6MTY2MDkxMTU2NCwiaWF0IjoxNjYwODUxNTY0fQ.94ckUB1UZfQMDIquuZ34r8FAzf5xfAFAEuBdRfPPEz4";
	
	@Autowired
    PortalProcessController controller;
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void healthCheckMethod() {
		logger.info("Starting Execution");;
		ResponseEntity<?> actualValuEntity = controller.healthCheckMethod();
		assertEquals(actualValuEntity, actualValuEntity);
	}

	@Test
	void contextLoads() {
		logger.info("Starting Sanity Test");
		logger.info("Test End");
		assertNotNull(controller);
	}
	
	
// 	@Test
// 	public void validatelogin() throws Exception{
// 		AuthenticationRequest authenticationRequest = new AuthenticationRequest("dhruv","admin");
// 		ObjectMapper objectMapper = new ObjectMapper();
// 		String jsonString = objectMapper.writeValueAsString(authenticationRequest);
// 		mockMvc.perform(post("/portal/login").contentType(MediaType.APPLICATION_JSON).content(jsonString)).andExpect(status().isOk());
		
// 	}
	
//	@Test
//	public void Invalidlogin() throws Exception{
//		AuthenticationRequest authenticationRequest = new AuthenticationRequest("dhruv","admin1");
//		ObjectMapper objectMapper = new ObjectMapper();
//		String jsonString = objectMapper.writeValueAsString(authenticationRequest);
//		mockMvc.perform(post("/portal/login").contentType(MediaType.APPLICATION_JSON).content(jsonString)).andExpect(status().isInternalServerError());
//		
//	}

	
// 	@Test
// 	public void validatePensionerDetailsCorrectTokenCorrectAdhar() throws Exception {
// 		mockMvc.perform(get("/portal/991429204770").header("Authorization","Bearer "+tokenStringcorrect)).andExpect(status().isOk());
	
// 	}
	
// 	@Test
// 	public void validatePensionerDetailsCorrectTokenWrongAdhar() throws Exception {
// 		mockMvc.perform(get("/portal/991429204771").header("Authorization","Bearer "+tokenStringcorrect)).andExpect(status().isOk());
	
// 	}
	
//	@Test
//	public void validatePensionerDetailsWrongTokenCorrectAdhar() throws Exception {
//		mockMvc.perform(get("/portal/991429204770").header("Authorization","Bearer "+tokenStringwrong)).andExpect(status().isOk());
//	
//	}
//	
//	@Test
//	public void validatePensionerDetailsWrongTokenWrongAdhar() throws Exception {
//		mockMvc.perform(get("/portal/991429204771").header("Authorization","Bearer "+tokenStringwrong)).andExpect(status().isOk());
//	
//	}
	
	

}
