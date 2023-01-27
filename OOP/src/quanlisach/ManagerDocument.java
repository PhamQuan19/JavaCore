/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlisach;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ManagerDocument {
    List<Document> documents;

    public ManagerDocument() {
        this.documents=new ArrayList<>();
    }
    
    public void addDocuments(Document document){
        this.addDocuments(document);
    }
    

    public void showInfor() {
      //  this.documents.forEach(documents -> System.out.println(documents.toString()));
        for (Document document : documents) {
            System.out.println(document.toString());
        }
    }
    
     public void searchByBook() {
        this.documents.stream().filter((var doc) -> {
            return doc instanceof Book;
        }).forEach(doc -> System.out.println(doc.toString()));
    }
    
    
    
}
