package com.testproject.app.rest.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //requiere de JPA Dependency
@Getter
@Setter
@AllArgsConstructor //genera un constructor con un parámetro para cada campo en su clase
@NoArgsConstructor //generará un constructor sin parámetros
@Table(schema = "tasksCrud")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String title;
    @Column
    private String description;

}
