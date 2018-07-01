package org.study.mapper;

import org.apache.ibatis.annotations.Param;
import org.study.entity.Student3;

import java.util.List;

/**
 * @author liuwang
 * @date 2018/6/26
 */
public interface Student3Mapper {

    public Student3 selectOne(int id);

    public List<Student3> selectTwo(@Param("username") String username,@Param("password") String password);

    public List<Student3> selectThree(@Param("username") String username,@Param("password") String password);

    public List<Student3> selectFour(@Param("username") String username,@Param("password") String password);

    public List<Student3> selectFive(@Param("list") List<Integer> list);

    public int updateOne(int id ,@Param("username") String username,@Param("password") String password);

}
