package com.beauchef.databaselogging.model.repository;

import com.beauchef.databaselogging.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author beauchef on 2018-09-26.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
