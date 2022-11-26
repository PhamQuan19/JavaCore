/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
/**
 *
 * @author Admin
 */
public class QuanLiCanBo {
    
    private List<CanBo> canbo;

    public QuanLiCanBo() {
        this.canbo=new ArrayList<>();
    }

    public void themCB(CanBo cb){
        this.canbo.add(cb);
    }
    
    public void Show(){
        for (CanBo canBo : canbo) {
            System.out.println(canBo.toString());
        }
    }
    
    public List<CanBo> search(String name){
        return this.canbo.stream().filter(o -> o.getHoTen().contains(name)).collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        
    }
    
    
    
}
