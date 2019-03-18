/**
 * 
 */
package com.rk.metro.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rk.metro.entities.PassangerEntity;

/**
 * @author Ramu
 *
 */
@Repository

public interface PassangerRepository extends JpaRepository<PassangerEntity, Long>, Serializable {

	//(@Query = "select p from PassangerEntity where p.passangerId=:passangerId")
	PassangerEntity findByPassangerId(Long passangerId);
	
}
