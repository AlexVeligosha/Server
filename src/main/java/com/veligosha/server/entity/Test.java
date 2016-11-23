package com.veligosha.server.entity;


import javax.persistence.*;
import java.util.Set;

/**
 * Simple JavaBean object that represents role of the {@link User}
 * @author Alex Veligohsa
 * @version 1.0
 */

@Entity
@Table(name = "test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    public Test() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
