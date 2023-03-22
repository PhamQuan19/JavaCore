/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Admin
 */
public class Worker {
    private String name;
    private double salaryPerday;
    private int worday;

    public Worker() {
    }

    public Worker(String name, double salaryPerday, int worday) {
        this.name = name;
        this.salaryPerday = salaryPerday;
        this.worday = worday;
    }

    public Worker(String name, double salaryPerday) {
        this.name = name;
        this.salaryPerday = salaryPerday;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryPerday() {
        return salaryPerday;
    }

    public void setSalaryPerday(double salaryPerday) {
        this.salaryPerday = salaryPerday;
    }

    public int getWorday() {
        return worday;
    }

    public void setWorday(int worday) {
        this.worday = worday;
    }
    
    public void display(){
        System.out.println(name+"\t"+salaryPerday*worday);
    }
    @Override
    public String toString(){
        return name+"\t"+salaryPerday+"\t"+worday;
    }
    
}
