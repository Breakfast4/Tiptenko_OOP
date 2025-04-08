package ru.ivt5.school;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TraineeMap {
    private final Map<Trainee, String> map = new HashMap();

    public TraineeMap() {
    }

    public void addTraineeInfo(Trainee trainee, String institute) throws TrainingException {
        if (this.map.containsKey(trainee)) {
            throw new TrainingException(TrainingErrorCode.DUPLICATE_TRAINEE);
        } else {
            this.map.put(trainee, institute);
        }
    }

    public void replaceTraineeInfo(Trainee trainee, String institute) throws TrainingException {
        if (!this.map.containsKey(trainee)) {
            throw new TrainingException(TrainingErrorCode.DUPLICATE_TRAINEE);
        } else {
            this.map.replace(trainee, institute);
        }
    }

    public void removeTraineeInfo(Trainee trainee) throws TrainingException {
        if (this.map.containsKey(trainee)) {
            throw new TrainingException(TrainingErrorCode.TRAINEE_NOT_FOUND);
        } else {
            this.map.remove(trainee);
        }
    }

    public int getTraineesCount() {
        return this.map.size();
    }

    public String getInstituteByTrainee(Trainee trainee) throws TrainingException {
        if (!this.map.containsKey(trainee)) {
            throw new TrainingException(TrainingErrorCode.TRAINEE_NOT_FOUND);
        } else {
            return (String)this.map.get(trainee);
        }
    }

    public Set<Trainee> getAllTrainees() {
        return this.map.keySet();
    }

    public Set<String> getAllInstitutes() {
        return Set.copyOf(this.map.values());
    }

    public boolean isAnyFromInstitute(String institute) {
        return this.map.containsValue(institute);
    }
}