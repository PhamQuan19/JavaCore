/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlisach;

/**
 *
 * @author Admin
 */
public class Journal extends Document{
    private int issueNumber;//số phát hành tạp chí
    private int monthIssue;

    public Journal(String id, String nxb, int number, int issueNumber, int monthIssue) {
        super(id, nxb, number);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }


    @Override
    public String toString() {
        return "Journal{" +
                "issueNumber=" + issueNumber +
                ", monthIssue=" + monthIssue +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
    
    
    
    
    
    
}
