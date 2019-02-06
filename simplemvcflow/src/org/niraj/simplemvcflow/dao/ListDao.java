package org.niraj.simplemvcflow.dao;

import org.niraj.simplemvcflow.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by n12p on 2/5/2019.
 */
public interface  ListDao{
    public void insert(Student student);
   public List <Student>getAll();
}
