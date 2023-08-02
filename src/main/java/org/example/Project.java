package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Project {
    private String name;
    private LocalDate dueDate;
    private Priority priority;

    public Project(String name, LocalDate dueDate, Priority priority) {
        this.name = name;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return name.equals(project.name) && dueDate.equals(project.dueDate) && priority == project.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dueDate, priority);
    }

    @Override
    public String toString() {
        return "Project [name=" + name + ", dueDate=" + dueDate + ", priority=" + priority + "]";
    }
}

