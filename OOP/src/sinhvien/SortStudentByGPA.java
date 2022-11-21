/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinhvien;

import java.util.Comparator;

/**
 *
 * @author Admin
 */

//sắp xếp sinh viên tăng dần theo điểm trung bình.
public class SortStudentByGPA implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGpa() > o2.getGpa()){
            return 1;
        }
        return -1;
    }
    
}
