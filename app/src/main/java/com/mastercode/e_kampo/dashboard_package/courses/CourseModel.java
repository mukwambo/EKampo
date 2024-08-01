package com.mastercode.e_kampo.dashboard_package.courses;

public class CourseModel {
    private int courseImg;
    private String courseName;

    public CourseModel(int courseImg, String courseName) {
        this.courseImg = courseImg;
        this.courseName = courseName;
    }

    public int getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(int courseImg) {
        this.courseImg = courseImg;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
