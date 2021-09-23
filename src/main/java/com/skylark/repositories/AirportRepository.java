/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
=======
>>>>>>> f3511c4fdf931c143d447b2929f78e7c0b424cb2

import com.skylark.entities.Airports;

public interface AirportRepository extends JpaRepository<Airports, String> {
	Optional<Airports> findByAirportName(String name);
}
