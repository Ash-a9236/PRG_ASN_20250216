
/*PRG_ASN_20250216//////////////////////////////////////////////////////////////////////////////////////////////////////

    Assignment 01
    Written by : Helene Rousseau 6229734
    For “Programming patterns” Section 00001 – Winter 2025

    EXPL :
    -------------------------------------------------------------------------
    -------------------------------------------------------------------------
    -------------------------------------------------------------------------

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/

package asha9236.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //BASE PATIENTS/////////////////////////////////////////////////////////////////////////////////////////////////
        Patient patient01 = new Patient("John Smith",        34, SEVERITY.MEDIUM,   false);
        Patient patient02 = new Patient("Emma Johnson",      45, SEVERITY.HIGH,     true);
        Patient patient03 = new Patient("James Brown",       56, SEVERITY.CRITICAL, true);
//        Patient patient04 = new Patient("Olivia Davis",      29, SEVERITY.LOW,      false);
//        Patient patient05 = new Patient("Michael Wilson",    62, SEVERITY.MEDIUM,   false);
//
//        Patient patient06 = new Patient("Sophia Moore",      40, SEVERITY.HIGH,     true);
//        Patient patient07 = new Patient("Liam Taylor",       51, SEVERITY.CRITICAL, true);
//        Patient patient08 = new Patient("Isabella Anderson", 38, SEVERITY.LOW,      false);
//        Patient patient09 = new Patient("Ethan Thomas",      65, SEVERITY.HIGH,     false);
//        Patient patient10 = new Patient("Ava Martinez",      48, SEVERITY.MEDIUM,   true);
//
//        Patient patient11 = new Patient("Mason Clark",       52, SEVERITY.MEDIUM,   false);
//        Patient patient12 = new Patient("Amelia Rodriguez",  29, SEVERITY.LOW,      false);
//        Patient patient13 = new Patient("Noah Lewis",        39, SEVERITY.HIGH,     true);
//        Patient patient14 = new Patient("Charlotte Walker",  61, SEVERITY.CRITICAL, true);
//        Patient patient15 = new Patient("Benjamin Harris",   47, SEVERITY.MEDIUM,   false);

        Hospital.Node<Patient> Head = new Hospital.Node<>(patient01);
        Hospital<Patient> hospital = new Hospital<>(Head);

        hospital.addPatient(patient01);
        hospital.addPatient(patient02);
        hospital.addPatient(patient03);
        System.out.println();
        System.out.println(hospital.getNode1("John Smith"));


//        hospital.addPatient(patient04);
//        hospital.addPatient(patient05);
//
//        hospital.addPatient(patient06);
//        hospital.addPatient(patient07);
//        hospital.addPatient(patient08);
//        hospital.addPatient(patient09);
//        hospital.addPatient(patient10);
//
//        hospital.addPatient(patient11);
//        hospital.addPatient(patient12);
//        hospital.addPatient(patient13);
//        hospital.addPatient(patient14);
//        hospital.addPatient(patient15);

        //CONSOLE APP///////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        * 5.display current ICU patients
        * 6. display patients by severity levels
        * 8. exit
        * */
        int userAns;
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to youWillDieHere Hospital :) \n");
        menu();

        userAns = console.nextInt();
        while (userAns != 8) {
            switch (userAns) {
                case 1:
                    System.out.println("ADD NEW PATIENT");
                    System.out.println("Please input the following : ");

                    System.out.print("NAME : ");
                    String name = console.next();
                    System.out.print("AGE : ");
                    int age = console.nextInt();
                    System.out.print("SEVERITY : ");
                    String severity = console.next().toUpperCase();
                    System.out.print("IN ICU (Y/N): ");
                    String inICU = console.next();
                    boolean bInICU = false;

                    if (inICU.equalsIgnoreCase("y")) {
                        bInICU = true;
                    }
                    Patient tempPatient = new Patient(name, age, SEVERITY.valueOf(severity), bInICU);
                    hospital.addPatient(tempPatient);
                    //hospital.getNode(name).toString();

                    menu();
                    //String trash = console.next();
                    userAns = console.nextInt();
                    break;
                case 2:
                    System.out.println("REMOVE PATIENT");
                    System.out.println("Please input the following : ");

                    System.out.print("NAME : ");
                    name = console.next();

                    hospital.removePatient(name);
                    //System.out.println(hospital.getNode(name).toString());

                    menu();
                    String trash = console.next();
                    userAns = console.nextInt();
                    break;
                case 3:
                    System.out.println("DISPLAY PATIENTS");
                    hospital.displayPatients();

                    menu();
                    //trash = console.next();
                    userAns = console.nextInt();
                    break;
                case 4:
                    System.out.println("MOVE PATIENT TO ICU");
                    System.out.println("Please input the following : ");

                    System.out.print("NAME : ");
                    name = console.next();

                    hospital.markAsICU(name);
                    System.out.println(hospital.getNode(name).toString());

                    menu();
                    trash = console.next();
                    userAns = console.nextInt();
                    break;
                case 5:
                    System.out.println("UPDATE PATIENT SEVERITY");
                    System.out.println("Please input the following : ");

                    System.out.print("NAME : ");
                    name = console.next();
                    System.out.print("NEW SEVERITY : ");
                    String newSeverity = console.next();

                    hospital.updateSeverity(name, newSeverity);
                    System.out.println(hospital.getNode(name).toString());

                    menu();
                    trash = console.next();
                    userAns = console.nextInt();
                    break;
                case 6:
                    System.out.println("DISPLAY PATIENT BY SEVERITY");

                    menu();
                    trash = console.next();
                    userAns = console.nextInt();
                    break;
                case 7:
                    System.out.println("DISPLAY CURRENT ICU PATIENTS");

                    menu();
                    trash = console.next();
                    userAns = console.nextInt();
                    break;
                default:
                    System.out.println("[ERROR : OPTION NOT VALID]");
                    menu();
                    break;
            }
        }
    }



    public static void menu() {
        System.out.println("─────────────────────────────────────────────────────────────────────");
        System.out.println("│  1. Add Patient                  5. Update Patient Severity       │");
        System.out.println("│  2. Remove Patient               6. Display Patients by Severity  │");
        System.out.println("│  3. Display Patients             7. Display Current ICU Patients  │");
        System.out.println("│  4. Move Patient to ICU          8. EXIT                          │");
        System.out.println("─────────────────────────────────────────────────────────────────────");

        System.out.print("\n\n Please input your next action : ");
    }
}