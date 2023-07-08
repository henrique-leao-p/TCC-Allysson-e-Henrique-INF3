package model;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "street", length = 222)
    private String street;

}
