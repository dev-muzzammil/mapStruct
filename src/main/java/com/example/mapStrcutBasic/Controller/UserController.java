package com.example.mapStrcutBasic.Controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapStrcutBasic.DTO.RequestDTO;
import com.example.mapStrcutBasic.DTO.ResponseDTO;
import com.example.mapStrcutBasic.Service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

	
	private final UserService userService;
	
	
	@PostMapping
	public ResponseEntity<ResponseDTO> create(@RequestBody RequestDTO request){
		return ResponseEntity.ok(userService.create(request));
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<ResponseDTO> get(@PathVariable Long id) {
		return ResponseEntity.ok(userService.get(id));
	}
	
	
	@GetMapping
	public ResponseEntity<Page<ResponseDTO>> list(Pageable pageable) {
	    return ResponseEntity.ok(userService.list(pageable));
	}
		
	
	@PatchMapping("/{id}")
	public ResponseEntity<ResponseDTO> update(@PathVariable Long id, @RequestBody RequestDTO request){
		return ResponseEntity.ok(userService.update(id, request));
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		userService.delete(id);
		return ResponseEntity.noContent().build();
	}
	

}
