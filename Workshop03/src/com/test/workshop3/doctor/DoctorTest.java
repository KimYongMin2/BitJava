package com.test.workshop3.doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorTest {
    
    public static void main( String[] args ) {
        
        List<Dentist> dent = new ArrayList<Dentist>();
        List<Surgeon> surg = new ArrayList<Surgeon>();
        
        dent.add(new Dentist("ȫ�浿"));
        dent.add(new Dentist("����ġ"));

        surg.add(new Surgeon("�Ӳ���"));
        surg.add(new Surgeon("ȫ���"));
        surg.add(new Surgeon("������"));

        for (int i = 0; i < dent.size(); i++) {
            System.out.println(dent.get(i).toString());
            dent.get(i).treatPatient();
            dent.get(i).pullOutTooth();
        }
        for (int i = 0; i < surg.size(); i++) {
            System.out.println(surg.get(i).toString());
            surg.get(i).treatPatient();
            surg.get(i).performSurgery();
        }

        
        //TODO �ǻ� ���� ���

    }
}