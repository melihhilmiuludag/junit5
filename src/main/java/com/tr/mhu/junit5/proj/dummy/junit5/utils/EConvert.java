package com.tr.mhu.junit5.proj.dummy.junit5.utils;

import com.tr.mhu.junit5.proj.dummy.junit5.domain.dtos.PeopleDto;
import com.tr.mhu.junit5.proj.dummy.junit5.domain.entities.People;

import java.util.List;

/**
 * @author muludag on 25.04.2020
 */
public class EConvert {
	public static PeopleDto toPeopleDto(People e) {
		return new PeopleDto(e.getId(), e.getName(), e.getMail(), e.getPhoneNumber());
	}

	public static List<PeopleDto> list() {
		return List.of(new PeopleDto("1", "", "", ""), new PeopleDto("1", "", "", ""));
	}
}
