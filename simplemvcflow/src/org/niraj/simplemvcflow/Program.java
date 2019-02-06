package org.niraj.simplemvcflow;

import org.niraj.simplemvcflow.Controller.ListController;
import org.niraj.simplemvcflow.entity.Student;

import java.util.Scanner;

/**
 * Created by n12p on 2/5/2019.
 */
public class Program {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        ListController listController=new ListController(scanner,student);
        while (true)
        {
            listController.process();
        }

    }
}
