package com.cts.code.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class PensionDetail {
	@Id
	private String name;
	private String pensionIndicator;
	private String bankIndicator;
	private long pensionAmount;
	private long bankServiceCharge;
}
