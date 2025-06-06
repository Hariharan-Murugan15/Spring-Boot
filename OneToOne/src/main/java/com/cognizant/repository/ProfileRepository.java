package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer>{

}
