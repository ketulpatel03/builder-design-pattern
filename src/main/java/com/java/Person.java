package com.java;

public class Person {

    private String fName;
    private String lName;
    private String email;
    private String phone;

    private Person(Builder builder) {
        this.fName = builder.fName;
        this.lName = builder.lName;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class Builder {

        private String fName;
        private String lName;
        private String email;
        private String phone;

        public Builder fName(String fName) {
            this.fName = fName;
            return this;
        }

        public Builder lName(String lName) {
            this.lName = lName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Person build() {

            if (fName == null) {
                throw new IllegalArgumentException("fName can't be null");
            } else if (lName == null) {
                throw new IllegalArgumentException("lName can't be null");
            }

            return new Person(this);
        }
    }
}
