package com.test.workshop3.doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorTest {

    public static void main( String[] args ) {
        List<Dentist> dent = new ArrayList<Dentist>();
        List<Surgeon> surg = new ArrayList<Surgeon>();

        dent.add(new Dentist("홍길동"));
        dent.add(new Dentist("전우치"));

        surg.add(new Surgeon("임꺽정"));
        surg.add(new Surgeon("홍길순"));
        surg.add(new Surgeon("광개토"));

        //TODO 의사 정보 출력
/*
        for (int i = 0; i < dent.size(); i++) {
            System.out.println(dent.get(i));
            dent.get(i).treatPatient();
            dent.get(i).pullOutTooth();
        }
        for (int i = 0; i < surg.size(); i++) {
            System.out.println(dent.get(i));
            surg.get(i).treatPatient();
            surg.get(i).performSurgery();
        }

 */

        for(Dentist d : dent){
            System.out.println(d);
            d.treatPatient();
            d.pullOutTooth();
        }

        for(Surgeon s : surg){
            System.out.println(s);
            s.treatPatient();
            s.performSurgery();
        }
    }
}