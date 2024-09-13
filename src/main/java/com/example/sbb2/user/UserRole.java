package com.example.sbb2.user;

import lombok.Getter;

@Getter

public class UserRole {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    UserRole(String value) {
        this.value = value;
    }

    private String value;
}
