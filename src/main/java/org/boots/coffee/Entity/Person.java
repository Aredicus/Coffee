package org.boots.coffee.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Controller;


@Setter
@Getter
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
}
