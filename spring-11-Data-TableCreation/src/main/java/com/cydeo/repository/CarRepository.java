package com.cydeo.repository;

import com.cydeo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //after one of the spring updates, no need to put it
public interface CarRepository extends JpaRepository<Car,Long> {



}
