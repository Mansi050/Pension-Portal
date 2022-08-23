package com.cts.code.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.code.entity.AuthenticationRequest;

@Repository
public interface PortalRepo extends JpaRepository<AuthenticationRequest,String>{

}
