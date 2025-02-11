
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

import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //BASE PATIENTS/////////////////////////////////////////////////////////////////////////////////////////////////
        Patient patient01 = new Patient("John Smith",        34, SEVERITY.MEDIUM,   false);
        Patient patient02 = new Patient("Emma Johnson",      45, SEVERITY.HIGH,     true);
        Patient patient03 = new Patient("James Brown",       56, SEVERITY.CRITICAL, true);
        Patient patient04 = new Patient("Olivia Davis",      29, SEVERITY.LOW,      false);
        Patient patient05 = new Patient("Michael Wilson",    62, SEVERITY.MEDIUM,   false);

        Patient patient06 = new Patient("Sophia Moore",      40, SEVERITY.HIGH,     true);
        Patient patient07 = new Patient("Liam Taylor",       51, SEVERITY.CRITICAL, true);
        Patient patient08 = new Patient("Isabella Anderson", 38, SEVERITY.LOW,      false);
        Patient patient09 = new Patient("Ethan Thomas",      65, SEVERITY.HIGH,     false);
        Patient patient10 = new Patient("Ava Martinez",      48, SEVERITY.MEDIUM,   true);

        Patient patient11 = new Patient("Mason Clark",       52, SEVERITY.MEDIUM,   false);
        Patient patient12 = new Patient("Amelia Rodriguez",  29, SEVERITY.LOW,      false);
        Patient patient13 = new Patient("Noah Lewis",        39, SEVERITY.HIGH,     true);
        Patient patient14 = new Patient("Charlotte Walker",  61, SEVERITY.CRITICAL, true);
        Patient patient15 = new Patient("Benjamin Harris",   47, SEVERITY.MEDIUM,   false);

        Hospital.Node<Patient> Head = new Hospital.Node<>(patient01);
        Hospital<Patient> hospital = new Hospital<>(Head);

        Hospital.Node<Patient> patientNode02 = new Hospital.Node<>(patient02);
        Hospital.Node<Patient> patientNode03 = new Hospital.Node<>(patient03);
        Hospital.Node<Patient> patientNode04 = new Hospital.Node<>(patient04);
        Hospital.Node<Patient> patientNode05 = new Hospital.Node<>(patient05);

        Hospital.Node<Patient> patientNode06 = new Hospital.Node<>(patient06);
        Hospital.Node<Patient> patientNode07 = new Hospital.Node<>(patient07);
        Hospital.Node<Patient> patientNode08 = new Hospital.Node<>(patient08);
        Hospital.Node<Patient> patientNode09 = new Hospital.Node<>(patient09);
        Hospital.Node<Patient> patientNode10 = new Hospital.Node<>(patient10);

        Hospital.Node<Patient> patientNode11 = new Hospital.Node<>(patient11);
        Hospital.Node<Patient> patientNode12 = new Hospital.Node<>(patient12);
        Hospital.Node<Patient> patientNode13 = new Hospital.Node<>(patient13);
        Hospital.Node<Patient> patientNode14 = new Hospital.Node<>(patient14);
        Hospital.Node<Patient> patientNode15 = new Hospital.Node<>(patient15);

        //CONSOLE APP///////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        * 5.display current ICU patients
        * 6. display patients by severity levels
        * 8. exit
        * */
        int userAns;
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to youWillDieHere Hospital :) \nPlease input your next action ....");
        System.out.println("1. Add Patient                  5. Update Patient Severity");
        System.out.println("2. Remove Patient               6. Display Patients by Severity");
        System.out.println("3. Display Patients             7. Display Current ICU Patients");
        System.out.println("4. Move Patient to ICU          8. EXIT");

        userAns = console.nextInt();
        while (userAns != 8) {
            switch (userAns) {
                case 1:
                    System.out.println("ADD NEW PATIENT");
                    System.out.println("Please input the following : ");

                    System.out.print("NAME : ");
                    String nameCase01 = console.next();
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
                    Patient tempPatient = new Patient(nameCase01, age, SEVERITY.valueOf(severity), bInICU);
                    hospital.addPatient(tempPatient);

                    break;
                case 2:
                    System.out.println("REMOVE PATIENT");
                    System.out.println("Please input the following : ");

                    System.out.print("NAME : ");
                    String nameCase02 = console.next();

                    hospital.removePatient(nameCase02);
                    break;
                case 3:
                    System.out.println("DISPLAY PATIENTS");
                    hospital.displayPatients();
                    break;
                case 4:
                    System.out.println("MOVE PATIENT TO ICU");
                    System.out.println("Please input the following : ");

                    System.out.print("NAME : ");
                    String nameCase04 = console.next();

                    hospital.markAsICU(nameCase04);
                    break;
                case 5:
                    System.out.println("UPDATE PATIENT SEVERITY");
                    System.out.println("Please input the following : ");

                    System.out.print("NAME : ");
                    String nameCase05 = console.next();
                    System.out.print("NEW SEVERITY : ");
                    String newSeverity = console.next();

                    hospital.updateSeverity(nameCase05, newSeverity);
                    break;
                case 6:
                    System.out.println("DISPLAY PATIENT BY SEVERITY");

                    break;
                case 7:
                    System.out.println("DISPLAY CURRENT ICU PATIENTS");

                    break;
                default:
                    System.out.println("1. Add Patient                  5. Update Patient Severity");
                    System.out.println("2. Remove Patient               6. Display Patients by Severity");
                    System.out.println("3. Display Patients             7. Display Current ICU Patients");
                    System.out.println("4. Move Patient to ICU          8. EXIT");
                    break;
            }
        }
    }
}