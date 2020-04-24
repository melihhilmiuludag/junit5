package com.tr.mhu.junit5.proj.dummy.junit5.repository;

import com.tr.mhu.junit5.proj.dummy.junit5.domain.entities.People;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author muludag on 25.04.2020
 */
public interface PeopleRepository extends JpaRepository<People, String> {

}
