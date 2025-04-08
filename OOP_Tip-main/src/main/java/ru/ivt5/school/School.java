package ru.ivt5.school;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class School {
    private String name;
    private int year;
    private final Set<Group> groups;

    public School(String name, int year) throws TrainingException {
        if (name == null || name.isEmpty()) {
            throw new TrainingException(TrainingErrorCode.SCHOOL_WRONG_NAME);
        }

        this.name = name;
        this.year = year;
        this.groups = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws TrainingException {
        if (name == null || name.isEmpty()) {
            throw new TrainingException(TrainingErrorCode.SCHOOL_WRONG_NAME);
        }

        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Set<Group> getGroups() {
        return new HashSet<>(groups);
        // return groups;
    }

    public void  addGroup(Group group) throws TrainingException {
        if (!groups.add(group)) {
            throw new TrainingException(TrainingErrorCode.DUPLICATE_GROUP_NAME);
        }

        groups.add(group);
    }

    public void  removeGroup(Group group) throws TrainingException {
        if (!groups.remove(group)) {
            throw new TrainingException(TrainingErrorCode.GROUP_NOT_FOUND);
        }

        groups.remove(group);
    }

    public void  removeGroup(String name) throws TrainingException {
        Group group = groups.stream().filter(item -> item.getName().equals(name)).findFirst()
                .orElseThrow(() -> new TrainingException(TrainingErrorCode.GROUP_NOT_FOUND));

        groups.remove(group);
    }

    public boolean  containsGroup(Group group) {
        return groups.contains(group);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return year == school.year && Objects.equals(name, school.name) && Objects.equals(groups, school.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, groups);
    }
}
