package org.study.entity;

/**
 * @author liuwang
 * @date 2018/6/26
 */
public class Student {
    private int id;

    public Student(String username, String password, String description) {
        this.username = username;
        this.password = password;
        this.description = description;
    }

    private String username ;

    private String password;

    private String description;

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
