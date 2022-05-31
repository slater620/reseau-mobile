package com.example.springauthentification.Entities;


import javax.persistence.*;

@Entity
@Table

public class Contact {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected Integer id;
    @Column(name="number", unique = true)
    protected String number;
    @Column(name = "name")
    protected String name;
    @Column(name = "telephone")
    protected String telephone;

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNumber() {
    return this.number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTelephone() {
    return this.telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public User getUser() {
    return this.user;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", number='" + getNumber() + "'" +
      ", name='" + getName() + "'" +
      ", telephone='" + getTelephone() + "'" +
      ", user='" + getUser() + "'" +
      "}";
  }

  public void setUser(User user) {
    this.user = user;
  }
    @ManyToOne
    @JoinColumn(name = "user_id", updatable = false)
    private User user;


}
