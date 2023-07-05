package com.mycompany.Hw2;

public class EncapsulatedStudent {
    public int midterm;
    public int FinalExam;
    
    public EncapsulatedStudent(int midterm, int FinalExam){
        SetMidterm(midterm);
        SetFinalExam(FinalExam);
    }
    
    public void SetMidterm(int midterm){
        if(midterm < 0 || midterm > 100)
            throw new IllegalArgumentException("Wrong number1");
        this.midterm = midterm;     
    }
    
    public void SetFinalExam(int FinalExam){
        if(FinalExam < 0 || FinalExam > 100)
            throw new IllegalArgumentException("Wrong number2");
        this.FinalExam = FinalExam;   
    }
    
    public double GetAvarage(){
        return midterm * 0.4 + FinalExam * 0.6;
    }
}