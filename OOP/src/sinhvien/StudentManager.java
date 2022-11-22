package sinhvien;

import java.io.IOException;
import java.util.Collections;
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
   
   public void edit(int id) throws IOException{
       boolean isExisted=false;
       int size=studentList.size();
       for(int i=0;i<size;i++){
           if(studentList.get(i).getId()==id){
               isExisted=true;
               studentList.get(i).setName(inputName());
               studentList.get(i).setAge(inputAge());
               studentList.get(i).setAddress(inputAddress());
               studentList.get(i).setGpa(inputGpa());
               break;
               
           }
       }
       if(!isExisted){
           System.out.printf("id = %d not existed.\n",id);
       }else{
           studentDao.write(studentList); 
       }
   }
   
   public void delete(int id) throws IOException{
       Student student =null;
       int size=studentList.size();
       for(int i=0;i<size;i++){
           if(studentList.get(i).getId()==id){
               student=studentList.get(i);
               break;
           }
       }
       if(student !=null){
           studentList.remove(student);
           studentDao.write(studentList); 
       }
   }

   public void sortStudentByName() {
        Collections.sort(studentList, new SortStudentByName());
    }
 
   
    public void sortStudentByGPA() {
        Collections.sort(studentList, new SortStudentByGPA());
    }  
   public void show(){
       for(Student o :studentList){
           System.out.format("%5d | ",o.getId());
           System.out.format("%20s | ",o.getName());
           System.out.format("%5d | ",o.getAge());
           System.out.format("%20s | ",o.getAddress());
           System.out.format("%10.1f%n ",o.getGpa());
       }
   }
   
   public int inputId() {
        System.out.print("Input student id: ");
        while (true) {
            try {
                int id = Integer.parseInt((sc.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }
   
    private String inputName() {
        System.out.println("Input student name");
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
