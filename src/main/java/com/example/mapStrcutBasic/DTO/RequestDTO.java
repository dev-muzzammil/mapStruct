package com.example.mapStrcutBasic.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestDTO {

	private String fullName;
	private int age;
	private String emailId;
	private String contactNo;
	private String password;
	private String country;
	
}
