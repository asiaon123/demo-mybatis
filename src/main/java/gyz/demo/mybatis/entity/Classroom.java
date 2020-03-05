package gyz.demo.mybatis.entity;

import lombok.Data;

import java.util.List;

/**
 * @author Yaalon 2020/3/3
 */
@Data
public class Classroom {

    private Integer id;

    private String name;

    private Teacher headTeacher;

    private List<Student> students;

}
