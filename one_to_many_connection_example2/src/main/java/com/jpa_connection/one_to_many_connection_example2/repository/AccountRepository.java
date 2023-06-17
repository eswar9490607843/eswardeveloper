package com.jpa_connection.one_to_many_connection_example2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.jpa_connection.one_to_many_connection_example2.entity.Accounter;

public interface AccountRepository extends CrudRepository<Accounter,String> {


//List<Accounter> findByBankgetAccNum(String accNum);
	List<Accounter>findByBankIfscNo(String ifscNo);

//Object findAllById(String accNum);
}
