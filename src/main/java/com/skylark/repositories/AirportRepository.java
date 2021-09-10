/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skylark.entities.Airports;

public interface AirportRepository extends JpaRepository<Airports, String> {

}
