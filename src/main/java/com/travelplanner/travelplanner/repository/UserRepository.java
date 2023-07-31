package com.travelplanner.travelplanner.repository;

import com.travelplanner.travelplanner.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Repository> {


}
