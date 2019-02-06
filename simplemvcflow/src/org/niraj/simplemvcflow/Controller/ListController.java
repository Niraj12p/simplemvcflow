package org.niraj.simplemvcflow.Controller;

import org.niraj.simplemvcflow.entity.Student;
import org.niraj.simplemvcflow.service.ListService;
import org.niraj.simplemvcflow.service.serviceimpl.ListServiceImpl;

import java.util.Scanner;

/**
 * Created by n12p on 2/5/2019.
 */
public class ListController {
    ListService listService=new ListServiceImpl();
    Scanner scanner;
    Student student;
    public ListController(Scanner scanner,Student student)
    {
        this.scanner=scanner;
        this.student=student;
    }
    public void menu()
    {
        System.out.println("1.Add Record ");
        System.out.println("2.Get All Record ");
        System.out.println("3.Exit");

    }
    public void process()
    {
        menu();
        int choice= scanner.nextInt();
        switch (choice)
        {
            case 1:addRecord();
                break;
            case 2:getRecord();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
        }

    }
    public void addRecord()
    {
        System.out.println("Enter id");
        student.setId(scanner.nextInt());
        System.out.println("Enter firstname");
        student.setFirstName(scanner.next());
        System.out.println("Enter middlename");
        student.setMiddleName(scanner.next());
        System.out.println("Enter lastname");
        student.setLastName(scanner.next());
        listService.insert(student);
    }
    public void getRecord()
    {
        System.out.println(listService.getAll());
    }
}
