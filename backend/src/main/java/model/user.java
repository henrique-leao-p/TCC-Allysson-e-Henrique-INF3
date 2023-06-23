package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class user {
    @Id
    private long id;

    @Column(name = "name", length = 222)
    private String name;


}
