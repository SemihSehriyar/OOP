package com.mycompany.studentapp;

public class StudentApp {

    public static void main(String[] args) {
        MasterStudent m1 = new MasterStudent(1, 50.0f, 50.0f, 5);
        BachelourStudent b1 = new BachelourStudent(2, 100.0f, 100.f);
        PhDStudent p1 = new PhDStudent(3, 50.5f, 70.5f, 3, 5);
        
        Student m2 = new PhDStudent(4, 54.5f, 65.6f, 4, 5);
        
        ((ProjectScoreBehaviour)p1).projectScore();
    } 
}
