package com.koala.java.entity;

import java.util.Objects;

/**
 * day03
 * Create by koala on 2021-08-15
 */
public final class User {
    private final String name;
    private final User partner;

    public User(String name, User partner) {
        this.name = name;
        this.partner = partner;
    }

    public String getName() {
        return name;
    }

    public User getPartner() {
        return partner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) &&
                partner.equals(user.partner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, partner);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", partner=" + partner +
                '}';
    }
}
