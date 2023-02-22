/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNV;

/**
 *
 * @author Admin
 */
public class EmployPartTime {
    private int id;
    private String name;
    private String numberPhone;
    private String address;
    private double salary;
    private int timeHours;

    public EmployPartTime() {
    }

    public EmployPartTime(int id, String name, String numberPhone, String address, int timeHours) {
        this.id = id;
        this.name = name;
        this.numberPhone = numberPhone;
        this.address = address;
//        this.salary = salary;
        this.timeHours = timeHours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return timeHours*120000;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTimeHours() {
        return timeHours;
    }

    public void setTimeHours(int timeHours) {
        this.timeHours = timeHours;
    }
    
    public void display(){
        System.out.println("EmployPartime "+"id= "+id+","
                + " Name: "+name+", NumberPhone: "+numberPhone+
                ", Address: "+address+", Salary: "+getSalary()
                +", TimeHours: "+timeHours);
    }
}
