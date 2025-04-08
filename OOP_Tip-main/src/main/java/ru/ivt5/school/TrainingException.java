package ru.ivt5.school;

public class TrainingException extends Exception {
    private TrainingErrorCode TrainingErrorCode;

    public TrainingException(TrainingErrorCode errorCode) {
        super(errorCode.getErrorString());
        this.TrainingErrorCode = errorCode;
    }

    public TrainingException(Throwable cause) {
        super(cause);
    }

    public TrainingErrorCode getErrorCode() {
        return this.TrainingErrorCode;
    }
}

