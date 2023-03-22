/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package kethua;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface IWorker {
    public void dispalay(ArrayList<Worker> arrList);
    public void add(ArrayList<Worker> arrList);
    public void update(ArrayList<Worker> arrList,int index);
    public void delete(ArrayList<Worker> arrList,int index);
    public ArrayList<Worker> list5(ArrayList<Worker> arrList);
}
