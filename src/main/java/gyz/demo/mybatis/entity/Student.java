package gyz.demo.mybatis.entity;

import lombok.Data;

import java.util.List;

/**
 * @author Yaalon 2020/3/3
 */
@Data
public class Student {

    private Integer id;

    private String name;

    private Classroom classroom;

    private List<Teacher> teachers;

}
