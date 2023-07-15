package com.marketing.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketing.ENTITY.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long>{
//by using CRUDREPOSITORY FindAll method return type is ITERATOR
//where As JPAREPOSITORY findAll method return type is LIST
}
