package com.tr.mhu.junit5.proj.dummy.junit5.utils;

import com.tr.mhu.junit5.proj.dummy.junit5.domain.dtos.PeopleDto;
import com.tr.mhu.junit5.proj.dummy.junit5.domain.entities.People;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

/**
 * @author muludag on 25.04.2020
 */
@Slf4j
class EConvertTest {
	static int listSize;
	People entity;

	@BeforeEach
	void setUp() {
		this.entity = people();
		log.debug("test started...");
		listSize = 10;
	}

	@AfterEach
	void tearDown() {
		this.entity = new People();
		log.debug("test ended...");
	}

	@Test
	void toPeopleDto() {
		PeopleDto dto = peopleDto(this.entity);
		Assert.assertNotNull(dto);
		Assert.assertFalse("There is a problem!", dto.getId().isBlank());
	}

	PeopleDto peopleDto(People e) {
		return new PeopleDto(e.getId(), e.getName(), e.getMail(), e.getPhoneNumber());
	}

	People people() {
		People e = new People();
		e.setId("1010101");
		e.setName("dummy");
		e.setMail("dummy@mail.com");
		e.setPhoneNumber("1010101");
		return e;
	}

	@Test
	void list() {
		List<PeopleDto> peopleDtoList = Collections.nCopies(listSize, peopleDto(this.entity));
		//exp
		Assert.assertNotNull(peopleDtoList);
		Assert.assertTrue(peopleDtoList.size() > 0);
		Assert.assertEquals(peopleDtoList.size(), listSize);
	}


}