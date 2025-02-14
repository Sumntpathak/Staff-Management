package com.staff_management.Staff_Management.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;


@Data
@Entity
@NoArgsConstructor
@Table(name = "staff_table",uniqueConstraints = {@UniqueConstraint(columnNames = "staff_email")})
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long staffId;

    @Column(name = "staff_name")
    protected String name;

    @Column(name = "staff_email")
    protected String email;

    @Column(name = "staff_phone")
    protected String phone;

}
