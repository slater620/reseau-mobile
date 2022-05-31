package com.example.springauthentification.Entities;

import javax.persistence.*;

@Entity
@Table

public class Keyword {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected Integer id;
    @Column(name="word")
    private String word;
    @Column(name = "description")

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", word='" + getWord() + "'" +
            ", description='" + getDescription() + "'" +
            ", user='" + getUser() + "'" +
            "}";
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id", updatable = false)
    private User user;
}
