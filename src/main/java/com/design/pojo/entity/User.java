package com.design.pojo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Lumos
 */
@Data
public class User implements Serializable {
    private String id;
    private String userName;
    private String password;
    private String authority;

}
