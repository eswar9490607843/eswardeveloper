package com.jpa_connection.one_to_many_connection_example2.repository;

import org.springframework.data.repository.CrudRepository;

import com.jpa_connection.one_to_many_connection_example2.entity.Bank;

public interface BankRepository extends CrudRepository<Bank,String> {

}
