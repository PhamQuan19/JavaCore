/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

/**
 *
 * @author Admin
 */
public class EmployFullTime {
     private int id;
    private String name;
    private String numberPhone;
    private String address;
    private double salary;
    private int numberWorday;

    public EmployFullTime() {
    }

    public EmployFullTime(int id, String name, String numberPhone, String address, int numberWorday) {
        this.id = id;
        this.name = name;
        this.numberPhone = numberPhone;
        this.address = address;
//        this.salary = salary;
        this.numberWorday = numberWorday;
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
        return numberWorday*150000;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberWorday() {
        return numberWorday;
    }

    public void setNumberWorday(int numberWorday) {
        this.numberWorday = numberWorday;
    }

    @Override
    public String toString() {
        return "EmployFullTime{" + "id=" + id + ", name=" + name +
                ", numberPhone=" + numberPhone + ", address=" + address + 
                ", salary=" + getSalary() + ", numberWorday=" + numberWorday + '}';
    }
    
    public void disPlay(){
        System.out.println(toString());
    }
    
}
