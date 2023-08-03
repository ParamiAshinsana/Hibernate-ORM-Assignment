package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Main {
    @Id
    private String id;
    private String ISBN;
    private String title;
}
