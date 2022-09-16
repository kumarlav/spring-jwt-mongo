package com.lk.repository;

import com.lk.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * The interface User repository.
 *
 * @author LavKumar
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {

  /**
   * Find by username optional.
   *
   * @param username the username
   * @return the optional
   */
  Optional<User> findByUsername(String username);

  Optional<User> findByUsernameOrId(String username,String id);

  /**
   * Exists by username boolean.
   *
   * @param username the username
   * @return the boolean
   */
  Boolean existsByUsername(String username);

  /**
   * Exists by email boolean.
   *
   * @param email the email
   * @return the boolean
   */
  Boolean existsByEmail(String email);

}