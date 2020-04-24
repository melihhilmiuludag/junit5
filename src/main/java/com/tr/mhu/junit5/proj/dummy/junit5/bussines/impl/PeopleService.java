package com.tr.mhu.junit5.proj.dummy.junit5.bussines.impl;

import com.tr.mhu.junit5.proj.dummy.junit5.bussines.IPeopleService;
import com.tr.mhu.junit5.proj.dummy.junit5.domain.dtos.PeopleCreateDto;
import com.tr.mhu.junit5.proj.dummy.junit5.domain.dtos.PeopleDto;
import com.tr.mhu.junit5.proj.dummy.junit5.domain.entities.People;
import com.tr.mhu.junit5.proj.dummy.junit5.repository.PeopleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.tr.mhu.junit5.proj.dummy.junit5.utils.EConvert.toPeopleDto;

/**
 * @author muludag on 25.04.2020
 */
@Slf4j
@Service
public class PeopleService implements IPeopleService {

	@Autowired
	final
	PeopleRepository peopleRepository;

	public PeopleService(PeopleRepository peopleRepository) {
		this.peopleRepository = peopleRepository;
	}

	@Override
	public PeopleDto create(PeopleCreateDto createDto) {
		People e = new People();
		e.setName(createDto.getName());
		e.setMail(createDto.getMail());
		e.setPhoneNumber(createDto.getPhoneNumber());
		peopleRepository.save(e);
		return toPeopleDto(e);
	}
}
