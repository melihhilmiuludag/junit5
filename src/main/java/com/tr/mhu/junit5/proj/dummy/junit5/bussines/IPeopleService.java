package com.tr.mhu.junit5.proj.dummy.junit5.bussines;

import com.tr.mhu.junit5.proj.dummy.junit5.domain.dtos.PeopleCreateDto;
import com.tr.mhu.junit5.proj.dummy.junit5.domain.dtos.PeopleDto;

/**
 * @author muludag on 25.04.2020
 */
public interface IPeopleService {
	PeopleDto create(PeopleCreateDto createDto);
}
