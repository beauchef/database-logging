package com.beauchef.databaselogging.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author beauchef on 2018-10-04.
 */
@Data
@Builder
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(name = "uk_users_email", columnNames = {"email"}),
        @UniqueConstraint(name = "uk_users_username", columnNames = {"username"})
})
public class User {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.PROTECTED)
    private long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "username", length = 20, nullable = false, unique = true)
    private String username;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;
}
