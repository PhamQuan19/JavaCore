package sinhvien;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class StudentManager {
    public static Scanner sc=new Scanner(System.in);
    private List<Student> studentList;
    private StudentDao studentDao;

    public StudentManager() throws IOException {
        studentDao =new StudentDao();
        studentList=studentDao.read();
    }

   public void add() throws IOException{
       int id=(studentList.size()>0)?(studentList.size()+1):1;
       System.out.println("student id = "+id);
       String name =inputName();
       byte age=inputAge();
       String address=inputAddress();
       float gpa=inputGpa();
       Student student =new Student(id,name,age,address,gpa);
       studentList.add(student);
       studentDao.write(studentList); 
   }

    private String inputName() {
        System.out.println("Input student address");
        return sc.nextLine();
    }

    private byte inputAge() {
        System.out.println("Input student age");
        while(true){
            try{
                 byte age=Byte.parseByte(sc.nextLine());
                if(age<0 && age >100){
                throw new NumberFormatException();
                }
                return age;
            }catch(NumberFormatException ex){
                System.out.println("Invalid! Input student age again");
            }
            
           
        }
    }
    

    private String inputAddress() {
        System.out.print("Input student address: ");
        return sc.nextLine();
    }

    private float inputGpa() {
        System.out.println("Input student gpa: ");
        while (true) {
            try {
                float gpa = Float.parseFloat(sc.nextLine());
                if (gpa < 0.0 && gpa > 10.0) {
                    throw new NumberFormatException();
                }
                return gpa;
            } catch (NumberFormatException ex) {
                System.out.println("invalid! Input student gpa again: ");
            }
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
 
}
