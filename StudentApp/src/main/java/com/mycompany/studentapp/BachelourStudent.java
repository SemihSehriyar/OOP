package com.mycompany.studentapp;

public class BachelourStudent extends Student implements ProjectScoreBehaviour{
    
    BachelourStudent(int id, float mid, float fin){
        super(id, mid, fin);
    }
    
    @Override
    float computeTotalScore(){
        return computeBaseScore() + projectScore();
    }
    
    public float projectScore(){
        return 20;
    }
}
