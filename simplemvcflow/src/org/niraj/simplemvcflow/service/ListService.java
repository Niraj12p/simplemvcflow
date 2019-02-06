package org.niraj.simplemvcflow.service;

import org.niraj.simplemvcflow.entity.Student;

import java.util.List;

/**
 * Created by n12p on 2/5/2019.
 */

    public interface  ListService{
        public void insert(Student student);
        public List<Student> getAll();
    }

