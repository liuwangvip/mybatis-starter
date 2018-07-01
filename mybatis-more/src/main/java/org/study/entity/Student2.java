package org.study.entity;

import java.util.List;

/**
 * @author liuwang
 * @date 2018/6/26
 */
public class Student2 {
    public Student2() {
    }

    private int id;


    private String username ;

    private String password;

    private String description;

    private int courseId;

    private Course course;

    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", description='" + description + '\'' +
                ", courseId=" + courseId +
                ", course=" + course +
                ", courses=" + courses +
                '}';
    }

    public int getCourseId() {
        return courseId;
    }

    public Student2(int id, String username, String password, String description, int courseId, Course course) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.description = description;
        this.courseId = courseId;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student2(String username, String password, String description) {
        this.username = username;
        this.password = password;
        this.description = description;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
