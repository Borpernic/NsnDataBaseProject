/**
 *
 */
package ru.nsn.model;

import java.util.Properties;

/**
 * @author SYSTEM
 */
public class Owner extends Properties {
    private long ownerId;
    private String surname;
    private String name;
    private String phone;
    private String email;
    private int statusOwner;

    public Owner(long ownerId, String surname, String name, String phone, String email, int statusOwner) {
        this.ownerId = ownerId;
        this.surname = surname;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.statusOwner = statusOwner;
    }

    private long getOwnerId() {
        return ownerId;
    }

    private void setOwnerId(final long ownerId) {
        this.ownerId = ownerId;
    }

    private String getSurname() {
        return surname;
    }

    private void setSurname(final String surname) {
        this.surname = surname;
    }

    private String getName() {
        return name;
    }

    private void setName(final String name) {
        this.name = name;
    }

    private String getPhone() {
        return phone;
    }

    private void setPhone(final String phone) {
        this.phone = phone;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(final String email) {
        this.email = email;
    }

    private int getStatusOwner() {
        return statusOwner;
    }

    private void setStatusOwner(final int statusOwner) {
        this.statusOwner = statusOwner;
    }


}
