package com.example.mapStrcutBasic.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDTO {
	
	private String fullName;
	private int age;
	private String emailId;
	private String contactNo;
	private String country;


}
