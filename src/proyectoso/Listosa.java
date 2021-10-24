/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoso;

/**
 *
 * @author eduardo
 */
public class Listosa {
    private String aA;
    private String bB;
    private String cC;
    private int a1;
    
    //construcor vacio 
    public Listosa(){}
    public Listosa(String aA, String bB, String cC, int a1){
        this.aA = aA;
        this.bB = bB; 
        this.cC = cC;
        this.a1 = a1;
    }
    public String getAA(){
        return this.aA;
    }
    public void setAA(){
        this.aA = aA;
    }
    public String getBB(){
        return this.bB;
    }
    public void setBB(){
        this.bB = bB;
    }
    public String getCC(){
        return this.cC;
    }
    public void setCC(){
        this.cC = cC;
    }
    public int getA1(){
        return this.a1;
    }
    public void setA1(){
        this.a1 = a1;
    }
}

