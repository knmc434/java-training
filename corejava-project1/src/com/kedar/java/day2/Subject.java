package com.kedar.java.day2;

public class Subject {

    private int subjectId;
    private String subjectName;
    private int marks;

    public Subject(int subjectId, String subjectName, int marks) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
