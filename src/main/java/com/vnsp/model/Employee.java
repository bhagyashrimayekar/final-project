package com.vnsp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
public class Employee {
@Id
	private int empId;
	private String firstName;
	private String lastName;
	private String email;
	private String department;
	private String phone;
	private String adharNo;
	private String panNo;
	private double salary;
	
//test
	/*
	 * @OneToMany(cascade=CascadeType.ALL) private List<Address> address;
	 */	 
}
