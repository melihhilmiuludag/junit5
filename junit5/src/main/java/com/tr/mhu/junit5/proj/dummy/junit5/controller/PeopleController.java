package com.tr.mhu.junit5.proj.dummy.junit5.controller;

import com.tr.mhu.junit5.proj.dummy.junit5.bussines.IPeopleService;
import com.tr.mhu.junit5.proj.dummy.junit5.domain.dtos.PeopleCreateDto;
import com.tr.mhu.junit5.proj.dummy.junit5.domain.dtos.PeopleDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author muludag on 24.04.2020
 */
@Slf4j
@RestController
public class PeopleController {

	@Autowired
	final
	IPeopleService peopleService;

	public PeopleController(IPeopleService peopleService) {
		this.peopleService = peopleService;
	}

	@PostMapping("/people")
	public ResponseEntity<PeopleDto> create(@Valid @RequestBody PeopleCreateDto createDto) {
		PeopleDto result = peopleService.create(createDto);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
