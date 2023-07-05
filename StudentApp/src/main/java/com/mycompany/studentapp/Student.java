package com.mycompany.studentapp;

public abstract class Student {
    private int id;
    private float mid;
    private float fin;
    
    public Student (int id, float mid, float fin){
        this.id = id;
        this.mid = mid;
        this.fin = fin;
    }
    abstract float computeTotalScore();
    
    float computeBaseScore(){
        return (float) (this.mid * 0.4 + this.fin * 0.6);
    }
}
