package com.test.courceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.courceservice.model.CourceModel;

@Repository
public interface CourceRepository extends JpaRepository<CourceModel, String>{

}
