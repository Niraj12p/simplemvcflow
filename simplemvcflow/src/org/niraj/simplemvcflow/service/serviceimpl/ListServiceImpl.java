package org.niraj.simplemvcflow.service.serviceimpl;

import org.niraj.simplemvcflow.dao.ListDao;
import org.niraj.simplemvcflow.dao.daoimpl.ListDaoImpl;
import org.niraj.simplemvcflow.entity.Student;
import org.niraj.simplemvcflow.service.ListService;

import java.util.List;

/**
 * Created by n12p on 2/5/2019.
 */
public class ListServiceImpl implements ListService{
    ListDao listDao=new ListDaoImpl();

    public void insert(Student student)
    {
        listDao.insert(student);
    }
    public List<Student>getAll()
    {
    return  listDao.getAll();
    }

}
