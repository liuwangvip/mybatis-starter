package org.study.mapper;

import java.util.List;

/**
 * @author liuwang
 * @date 2018/6/26
 */
public interface Student2Mapper<Student> {

    public List listAll();

    public Student insertOne(Student stu);

}
