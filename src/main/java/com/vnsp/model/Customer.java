package com.vnsp.model;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
public class Customer {
	@Id
	private int cid;
	private String cname;

}
