package ru.ivt5.school;

public enum TrainingErrorCode {
    TRAINEE_WRONG_RATING("wrong rating"),
    TRAINEE_WRONG_LASTNAME("wrong lastName"),
    TRAINEE_WRONG_FIRSTNAME("wrong firstName"),
    GROUP_WRONG_NAME("wrong group_name"),
    GROUP_WRONG_ROOM("wrong group_room"),
    TRAINEE_NOT_FOUND("this trainee not exists"),
    DUPLICATE_GROUP_NAME("this name for trainee is already taken"),
    SCHOOL_WRONG_NAME("wrong school_name"),
    GROUP_NOT_FOUND("this group not found"),
    DUPLICATE_TRAINEE("info about this trainee already exist"),
    EMPTY_TRAINEE_QUEUE("this queue is empty");

    String errorString;

    private TrainingErrorCode(String errorString) {
        this.errorString = errorString;
    }

    public String getErrorString() {
        return this.errorString;
    }
}
