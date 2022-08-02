package com.codename1.testapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean marked;
    private boolean deleted;
    private String owner;

    public Item() {}

    public Item(Long id, String name, boolean marked, boolean deleted, String owner) {
        this.id = id;
        this.name = name;
        this.marked = marked;
        this.deleted = deleted;
        this.owner = owner;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the marked
     */
    public boolean isMarked() {
        return marked;
    }

    /**
     * @param marked the marked to set
     */
    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    /**
     * @return the deleted
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * @param deleted the deleted to set
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    
}