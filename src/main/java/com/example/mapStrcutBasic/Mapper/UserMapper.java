package com.example.mapStrcutBasic.Mapper;

import org.mapstruct.BeanMapping;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.example.mapStrcutBasic.DTO.RequestDTO;
import com.example.mapStrcutBasic.DTO.ResponseDTO;
import com.example.mapStrcutBasic.Entity.User;

@Mapper(componentModel = "spring" , builder = @Builder(disableBuilder = false))
public interface UserMapper {
	

    // ---------- GET → Entity to ResponseDTO ----------
	  @Mapping(target = "fullName", expression = "java(user.getFirstName() + \" \" + user.getLastName())")
	  @Mapping(source = "email" , target = "emailId")
	  @Mapping(source = "phoneNo" , target = "contactNo")
	ResponseDTO toResponse(User user);	
    
	
    // ---------- POST/PUT → RequestDTO to Entity ----------
    @Mapping(target = "firstName", expression = "java(splitFullName(toRequest.getFullName())[0])")
    @Mapping(target = "lastName", expression = "java(splitFullName(toRequest.getFullName())[1])")
	@Mapping(source = "emailId", target = "email")
	@Mapping(source = "contactNo", target = "phoneNo")
	User toEntity(RequestDTO toRequest);	
	
	
    // ---------- PATCH/Partial Update → RequestDTO → Update existing Entity ----------
    @Mapping(target = "firstName", expression = "java(splitFullName(request.getFullName())[0])")
    @Mapping(target = "lastName", expression = "java(splitFullName(request.getFullName())[1])")
    @Mapping(source = "emailId", target = "email")
    @Mapping(source = "contactNo", target = "phoneNo")
	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	void updateFromRequest(RequestDTO request, @MappingTarget User entity);

    
    // ---------- Helper Method for Splitting ----------
    default String[] splitFullName(String fullName) {
    	return fullName != null ? fullName.split(" " , 2) : new String[] {"" , ""};
    }
    
    
}
