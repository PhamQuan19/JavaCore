/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thisinh;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ManagerCandidate {
    List<Candidate> candidates;
    public ManagerCandidate() {
        this.candidates = new ArrayList<>();
    }
    
    public void add(Candidate candidate) {
        this.candidates.add(candidate);
    }
    
     public void showInfor() {
        this.candidates.forEach(candidate -> System.out.println(candidate.toString()));
    }

    public Candidate searchById(String id) {
        return this.candidates.stream().filter(candidate -> candidate.getId().equals(id)).findFirst().orElse(null);
    }
}
