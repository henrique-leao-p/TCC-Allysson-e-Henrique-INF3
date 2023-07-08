package model;

import jakarta.persistence.*;

@Entity
@Table(name = "Contact", schema = "matchup")
public class contact {

    //attributes

    @Id
    @Column(name = "contact_id1", nullable = false)
    private long id_user1;

    @Id
    @Column(name = "contact_id2", nullable = false)
    private long id_user2;

    //constructors

    public contact() {

    }

    public contact(long id_user1, long id_user2) {
        //implement something to get the ids from the respective users right away
        this.id_user1 = id_user1;
        this.id_user2 = id_user2;
    }

    //encapsulation

    public long getId_user1() {
        return id_user1;
    }

    public long getId_user2() {
        return id_user2;
    }

    //methods

}
