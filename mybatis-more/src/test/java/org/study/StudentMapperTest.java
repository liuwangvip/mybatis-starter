package org.study;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.study.entity.Student;
import org.study.util.SessionFactoryHelper;

import java.io.IOException;

/**
 * @author liuwang
 * @date 2018/6/30
 */
public class StudentMapperTest {
    @Test
    public void testSelectUser() throws IOException {
        SqlSession sqlSession = SessionFactoryHelper.getSessionFactory().openSession();
        try {
            Student student = sqlSession.selectOne("listAll");
            System.out.println(student.toString());
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void testInsertOne() throws IOException {
        SqlSession sqlSession = SessionFactoryHelper.getSessionFactory().openSession();
        try {
            Student student =new Student("A君","123456","todo");
            int count =sqlSession.insert("insertOne",student);
            System.out.println(count);
            sqlSession.commit();
        }finally {
            sqlSession.rollback();
            sqlSession.close();
        }
    }
}
