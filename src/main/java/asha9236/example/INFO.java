package asha9236.example;

/*
    You have been hired to develop a Hospital Patient Management System to help hospitals efficiently track patient
    records. The system will allow hospital staff to:
         Add new patients to the system.
         Remove discharged patients from the system.
         Search for a patient by name.
         Iterate through all patients in the hospital.
         Filter and iterate through ICU patients only.
         Sort and iterate patients by severity level (Critical > High > Medium > Low).
         Update a patient’s health status (change severity or ICU admission).

    You will implement a custom singly linked list (Hospital<T>) that supports iteration using Iterator<T> and
    Iterable<T> for efficient patient management.

    PATIENT CLASS_______________________________________________________________________________________________________

    attributes:
         String name
            → The patient’s full name.
         int age
            → The patient’s age.
         String severity
            → "Critical", "High", "Medium", "Low".
         boolean inICU
            → Whether the patient is in the Intensive Care Unit (ICU).

    Methods:
         void markAsICU()
            → Updates patient status to ICU.
         void updateSeverity(String newSeverity)
            → Changes a patient's severity.
         String toString()
            → Returns a formatted string of patient details.


    HOSPITAL CLASS______________________________________________________________________________________________________

    ***Implement the Hospital<T> Class Using a Singly Linked List
     Use a custom linked list (Node<T>) to store patients.

    methods:
        o void addPatient(T patient)
            → Adds a new patient.
        o void removePatient(String name)
            → Removes a patient by name.
        o boolean contains(String name)
            → Checks if a patient exists.
        o void updateSeverity(String name, String newSeverity)
            → Changes a patient’s severity.
        o void markAsICU(String name)
            → Marks a patient as in ICU.
        o void displayPatients()
            → Prints all patients.

    -Implement Iterator<T> and Iterable<T> for Patient Traversal

    - Implement a custom iterator (HospitalIterator<T>) that supports:
         boolean hasNext()
            → Checks if more patients exist.
         T next()
            → Returns the next patient.

    -Implement iteratorICUPatients() for Filtering ICU Patients
         Implement an iterator that only returns ICU patients.

    -Implement iteratorSortedBySeverity() for Sorting Patients by Severity
         Before iteration, convert the linked list to an array.
         Sort patients by severity level (Critical > High > Medium > Low).
         Return an iterator over the sorted list.
*/
public class INFO {
}
