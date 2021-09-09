package com.skylark.repositories;
/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 08-aug-2021
 * @copyright Sterlite technologies Ltd.
 * @description DAO Interface for Route
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.skylark.entities.Route;

public interface RouteRepository extends JpaRepository<Route, Integer> {

}
