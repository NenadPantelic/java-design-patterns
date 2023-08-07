package com.np.designpatterns.builder;

import java.util.Date;
import java.util.Objects;

public class User {

    private final String firstName;
    private final String lastName;
    private final String username;
    private final String email;
    private final Date birthDate;
    private final boolean active;

    private User(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        username = builder.username;
        email = builder.email;
        birthDate = builder.birthDate;
        active = builder.active;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return isActive() == user.isActive() &&
                Objects.equals(getFirstName(), user.getFirstName()) &&
                Objects.equals(getLastName(), user.getLastName()) &&
                Objects.equals(getUsername(), user.getUsername()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getBirthDate(), user.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getUsername(), getEmail(), getBirthDate(), isActive());
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", active=" + active +
                '}';
    }

    static class Builder {

        private String firstName;
        private String lastName;
        private String username;
        private String email;
        private Date birthDate;
        private boolean active;

        public Builder withFirstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withUsername(final String username) {
            this.username = username;
            return this;
        }

        public Builder withEmail(final String email) {
            this.email = email;
            return this;
        }

        public Builder withBirthDate(final Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder withActive(final boolean active) {
            this.active = active;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
