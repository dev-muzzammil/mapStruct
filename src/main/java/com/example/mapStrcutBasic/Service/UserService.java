package com.example.mapStrcutBasic.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.mapStrcutBasic.DTO.RequestDTO;
import com.example.mapStrcutBasic.DTO.ResponseDTO;

public interface UserService {

	ResponseDTO create(RequestDTO request);
	
	ResponseDTO get(Long id);
	
	Page<ResponseDTO> list(Pageable pageable);
	
	ResponseDTO update(Long id, RequestDTO request);
	
	void delete(Long id);
	
}
