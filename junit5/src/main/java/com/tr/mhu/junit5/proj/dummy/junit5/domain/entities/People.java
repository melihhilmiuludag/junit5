package com.tr.mhu.junit5.proj.dummy.junit5.domain.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author muludag on 25.04.2020
 */
@Entity
@Data
@Table(name = "people")
public class People {

	@Id
	@NotNull
	@NotEmpty
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Length(min = 36, max = 36)
	@Column(name = "id", nullable = false)
	private String id;

	@Column(name = "name")
	@Length(max = 100)
	private String name;

	@Column(name = "mail")
	@Length(max = 50)
	private String mail;

	@Column(name = "phone_number")
	@Length(max = 11)
	private String phoneNumber;

}
