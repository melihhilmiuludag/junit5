package com.tr.mhu.junit5.proj.dummy.junit5.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author muludag on 25.04.2020
 */
@Data
@AllArgsConstructor
public class PeopleDto {
	private String id;
	private String name;
	private String mail;
	private String phoneNumber;
}
