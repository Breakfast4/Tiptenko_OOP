package ru.ivt5.school;

import java.util.LinkedList;
import java.util.Queue;

public class TraineeQueue {
    private final Queue<Trainee> queue;

    public TraineeQueue() {
        this.queue = new LinkedList<>();
    }

    public void addTrainee(Trainee trainee) {
        queue.offer(trainee);
    }

    public Trainee removeTrainee() throws TrainingException {
        Trainee trainee = queue.poll();

        if (queue.isEmpty()) {
            throw new TrainingException(TrainingErrorCode.EMPTY_TRAINEE_QUEUE);
        }

        return trainee;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
