package com.lk.repository;

import com.lk.entities.Role;
import com.lk.enums.RoleEnum;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * The interface Role repository.
 *
 * @author LavKumar
 */
@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
  /**
   * Find by name optional.
   *
   * @param name the name
   * @return the optional
   */
  Optional<Role> findByName(RoleEnum name);
}