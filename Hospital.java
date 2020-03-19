///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lab4;
//
///**
// *
// * @author me
// */
public class Hospital {
  
     private String name;

    public Hospital(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newname) {
        this.name = newname;
    }//fixeaza un nume nou
  
}