package ru.ivt5.school;

import java.util.Objects;

public class Trainee {
    private String firstName;
    private String lastName;
    private int rating;

    public Trainee(String firstName, String lastName, int rating) throws TrainingException {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setRating(rating);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) throws TrainingException {
        if (firstName != null && !firstName.trim().isEmpty()) {
            this.firstName = firstName;
        } else {
            throw new TrainingException(TrainingErrorCode.TRAINEE_WRONG_FIRSTNAME);
        }
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) throws TrainingException {
        if (lastName != null && !lastName.trim().isEmpty()) {
            this.lastName = lastName;
        } else {
            throw new TrainingException(TrainingErrorCode.TRAINEE_WRONG_LASTNAME);
        }
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) throws TrainingException {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            throw new TrainingException(TrainingErrorCode.TRAINEE_WRONG_RATING);
        }
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Trainee trainee = (Trainee)o;
            return this.rating == trainee.rating && Objects.equals(this.firstName, trainee.firstName) && Objects.equals(this.lastName, trainee.lastName);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.firstName, this.lastName, this.rating});
    }
}