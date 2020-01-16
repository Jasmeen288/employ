/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testemploy;

/**
 *
 * @author mydev
 */
public class empoyee {
    private String name;
    private int id;
    private double nweek;
    private double hrate;
    public employee(String name,int id,double nweek,double hrate)
    {
        this.name=name;
        this.id=id;
        this.nweek=nweek;
        this.hrate=hrate;
    }
    
    public String getName()//accessor method or reads the velue
    {
    return name;
    }
    public int getId()
    {
        return id;
    }
    public double getNweek()
    {
        return nweek;
    }
    public double getHrate()
    {
        return hrate;
    }
    public void setName(Sring name)
    {
        this.name=name;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setNweek(double nweek)
    {
        this.nweek=nweek;
    }
    
    public double salary()
    {
        return nweek*hrate;
           
    }
    
}
