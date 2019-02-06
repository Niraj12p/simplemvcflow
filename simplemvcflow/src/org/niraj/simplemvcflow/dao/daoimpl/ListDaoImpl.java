package org.niraj.simplemvcflow.dao.daoimpl;

import org.niraj.simplemvcflow.dao.ListDao;
import org.niraj.simplemvcflow.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by n12p on 2/5/2019.
 */
public class ListDaoImpl implements ListDao {
    List<Student>studentList=new ArrayList<Student>();

    public void insert(Student student)
    {
        studentList.add(student);
    }
    public List<Student>getAll()
    {
        return studentList;
    }

    public static void main(String[] args) {

    }
}
