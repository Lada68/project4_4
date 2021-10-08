package com.amr.project.model.entity;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {

    private Long id;
    private String name;

    @Override
    public String getAuthority() {
        return null;
    }
}
