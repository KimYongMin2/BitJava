package com.test.workshop3.account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccountTest {    
    public static void main( String[] args ) {        
        int menu  = 0;
        Account acc = null;
        
        while ( menu != 9 ) {            
            printMenu();            
            try {                
                menu = Integer.parseInt(getUserInput());                
                //TODO �� �޴� ���� �� �ؾ� �� �� ����
                switch ( menu ) {
                case 1:     // ���� ����
                    System.out.print( "\n���¹�ȣ : " );
                    String account = getUserInput();
                    System.out.print( "������ : " );
                    String name = getUserInput();
                    System.out.print( "���� �Ա� : " );
                    int balance = getUserInputInt();
                    acc = new Account(account, name,balance);
                    break;
                case 2:     // ���� ���� ���
                    System.out.println(acc.toString());
                    break;
                case 3:     // �Ա�
                    System.out.print( "�Ա��� �ݾ� : " );
                    int plusBalance = getUserInputInt();
                    acc.deposit(plusBalance);
                    break;
                case 4:     // ���
                    System.out.print( "����� �ݾ� : " );
                    int miBalance = getUserInputInt();
                    acc.withdraw(miBalance);
                    break;
                case 9:     // ����
                    System.out.println( "�����մϴ�." );
                    break;
                default:
                    System.out.println( "[����] �޴��� �߸� �Է��Ͽ����ϴ�." );
                    break;
                }
                
                //TODO catch ����ȭ (������ ���� ��Ȳ ����)
            } catch ( Exception e ) {
                System.out.println("�����߻�");
                
            }
        }
    }
    
    private static void printMenu() {
        System.out.println( "\n===== < �޴� > =====" );
        System.out.println( " 1. ���� ����" );
        System.out.println( " 2. ���� ���� ���" );
        System.out.println( " 3. �Ա�" );
        System.out.println( " 4. ���" );
        System.out.println( " 9. ����" );
        System.out.println( "===================" );
        System.out.print( ">> �޴� : " );
    }
    
    public static String getUserInput() {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        return inputString;
    }

    public static int getUserInputInt(){
        String input = getUserInput();
        return Integer.parseInt(input);
    }
}