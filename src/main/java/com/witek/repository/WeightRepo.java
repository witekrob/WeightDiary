package com.witek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.witek.model.Weight;

@Repository
public interface WeightRepo extends JpaRepository<Weight, Long> {

}
