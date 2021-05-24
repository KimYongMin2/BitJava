package com.test.workshop3.doctor;

public class Dentist extends Doctor {
    public Dentist(String name){
        super(name, "치과");

    }
    void pullOutTooth(){
        System.out.println("이를 뽑습니다.");
    }

    //TODO Doctor 클래스 상속 받은 후, 클래스 완성
}