package com.pahlsoft.churchmap.dao;

import javax.persistence.*;

/**
 * Created by aj on 17/08/14.
 */
@Entity
@Table(name = "PARISHIONERS", schema = "", catalog = "churchmap")
public class ParishionersEntity {
    private int parishionerId;
    private String firstName;
    private String lastName;
    private String streetNumber;
    private String streetName;
    private String city;
    private String state;

    @Id
    @Column(name = "PARISHIONER_ID", nullable = false, insertable = true, updatable = true)
    public int getParishionerId() {
        return parishionerId;
    }

    public void setParishionerId(int parishionerId) {
        this.parishionerId = parishionerId;
    }

    @Basic
    @Column(name = "FIRST_NAME", nullable = false, insertable = true, updatable = true, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LAST_NAME", nullable = false, insertable = true, updatable = true, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "STREET_NUMBER", nullable = false, insertable = true, updatable = true, length = 45)
    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Basic
    @Column(name = "STREET_NAME", nullable = false, insertable = true, updatable = true, length = 45)
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Basic
    @Column(name = "CITY", nullable = false, insertable = true, updatable = true, length = 45)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "STATE", nullable = false, insertable = true, updatable = true, length = 45)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParishionersEntity that = (ParishionersEntity) o;

        if (parishionerId != that.parishionerId) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (streetName != null ? !streetName.equals(that.streetName) : that.streetName != null) return false;
        if (streetNumber != null ? !streetNumber.equals(that.streetNumber) : that.streetNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = parishionerId;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (streetNumber != null ? streetNumber.hashCode() : 0);
        result = 31 * result + (streetName != null ? streetName.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}
