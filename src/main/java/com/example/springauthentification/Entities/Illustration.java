package com.example.springauthentification.Entities;


import javax.persistence.*;

@Entity
@Table
public class Illustration {

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRefLink() {
        return this.refLink;
    }

    public void setRefLink(String refLink) {
        this.refLink = refLink;
    }

    public BusinessUser getBusinessUser() {
        return this.businessUser;
    }

    public void setBusinessUser(BusinessUser businessUser) {
        this.businessUser = businessUser;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected Integer id;

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", refLink='" + getRefLink() + "'" +
            ", businessUser='" + getBusinessUser() + "'" +
            "}";
    }

    @Column(name = "refLink")
    protected String refLink;
    @ManyToOne
    @JoinColumn(name = "businessuser_id", updatable = false)
    private BusinessUser businessUser;
}
