package com.example.hibernate.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @time: 2022/4/22 9:36
 * @user: wwf
 */
@Data
@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = -3580128339052053454L;

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    private String sex;

    private Integer age;

}
