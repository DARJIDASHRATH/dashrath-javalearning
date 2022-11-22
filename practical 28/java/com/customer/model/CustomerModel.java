package com.customer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel {

	private int id;

	@Column(length = 25, nullable = true)
	private String firstName;

	@Column(length = 25, nullable = true)
	private String lastName;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	@Column(length = 15, nullable = true)
	private String mobileNumber;

	private String address1;

	private String address2;

	@Column(length = 3, nullable = true)
	private Integer age;

	private String gender;

	@Column(length = 50)
	private String email;

}