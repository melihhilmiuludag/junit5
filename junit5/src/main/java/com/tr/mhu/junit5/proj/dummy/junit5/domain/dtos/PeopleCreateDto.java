package com.tr.mhu.junit5.proj.dummy.junit5.domain.dtos;

import com.tr.mhu.junit5.proj.dummy.junit5.domain.ResultMessage;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author muludag on 25.04.2020
 */
@Data
public class PeopleCreateDto {
	@NotNull(message = ResultMessage.PEOPLE_NAME_INVALID)
	@NotEmpty(message = ResultMessage.PEOPLE_NAME_MISSING)
	private String name;

	@NotNull(message = ResultMessage.PEOPLE_MAIL_INVALID)
	@NotEmpty(message = ResultMessage.PEOPLE_MAIL_MISSING)
	private String mail;

	private String phoneNumber;
}
