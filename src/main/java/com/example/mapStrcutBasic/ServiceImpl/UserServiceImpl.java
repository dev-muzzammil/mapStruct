package com.example.mapStrcutBasic.ServiceImpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.mapStrcutBasic.DTO.RequestDTO;
import com.example.mapStrcutBasic.DTO.ResponseDTO;
import com.example.mapStrcutBasic.Entity.User;
import com.example.mapStrcutBasic.Mapper.UserMapper;
import com.example.mapStrcutBasic.Repo.UserRepo;
import com.example.mapStrcutBasic.Service.UserService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements  UserService {

	
	private final UserRepo userRepo;
	private final UserMapper userMapper;
	
	
	@Override
	public ResponseDTO create(RequestDTO request) {
		User user = userMapper.toEntity(request);
		return userMapper.toResponse(userRepo.save(user));
	}
	
	
	@Override
	public ResponseDTO get(Long id) {
		User user = userRepo.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("User Not Found"));
		return userMapper.toResponse(user);
	}
	
	
	@Override
	public Page<ResponseDTO> list(Pageable pageable) {
		return userRepo.findAll(pageable).map(userMapper::toResponse);
	} 
	
	
	@Override
	public ResponseDTO update(Long id, RequestDTO request) {
		User user = userRepo.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("User Not Found"));
		userMapper.updateFromRequest(request, user);
		return userMapper.toResponse(userRepo.save(user));
	}
	
	
	@Override
	public void delete(Long id) {
		if(!userRepo.existsById(id)) throw new EntityNotFoundException("User Not Found");
		userRepo.deleteById(id);
	}
	
}
