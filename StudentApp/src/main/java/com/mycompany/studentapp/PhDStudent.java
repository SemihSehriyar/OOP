package com.mycompany.studentapp;

public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour {
    int numberOfArticles;
    
    PhDStudent(int id, float mid, float fin, int numberOfConf, int numberOfArticles){
        super(id, mid, fin, numberOfConf);
        this.numberOfArticles = numberOfArticles;
    }
    
    float computeTotalScore(){
        return computeBaseScore() + articleScore();
    }
     
    public float articleScore(){
        return numberOfArticles * 8;
    } 
}
