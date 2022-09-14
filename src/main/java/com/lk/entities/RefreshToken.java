package com.lk.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "refreshtoken")
@Data
public class RefreshToken {

    @Id
    private String id;

    @DBRef
    private User users;

    private String token;

    private Instant expiryDate;
}