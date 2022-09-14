package com.lk.entities;

import com.lk.enums.RoleEnum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
@Data
public class Role {

  @Id
  private String id;

  private RoleEnum name;

  public Role() {}

  public Role(RoleEnum name) {
    this.name = name;
  }

}