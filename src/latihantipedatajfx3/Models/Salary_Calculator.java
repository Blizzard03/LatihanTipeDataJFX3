/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihantipedatajfx3.Models;

import java.util.Date;

/**
 *
 * @author Muhamad Ariq Rasyid
 */
public class Salary_Calculator {
    private double salary,produce;
    private Date Work_in, Work_out;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getWork_in() {
        return Work_in;
    }

    public void setWork_in(Date Work_in) {
        this.Work_in = Work_in;
    }

    public Date getWork_out() {
        return Work_out;
    }

    public void setWork_out(Date Work_out) {
        this.Work_out = Work_out;
    }

    public double getProduce() {
        return produce;
    }

    public void setProduce(double produce) {
        this.produce = produce;
    }
    
    
    
    
}
