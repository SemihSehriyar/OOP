package com.mycompany.studentapp;

public class MasterStudent extends Student implements ConferenceScoreBehaviour {
    protected int numberOfConf;
    
    MasterStudent(int id, float mid, float fin, int numberOfConf){
        super(id, mid, fin);
        this.numberOfConf = numberOfConf;
    }
    
    float computeTotalScore(){
        return computeBaseScore() + conferenceScore();
    }
    
    public float conferenceScore(){
        return numberOfConf * 5;
    }
}