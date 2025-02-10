package asha9236.example;

public class Patient {
    private String name;
    private int age;
    private SEVERITY severity;
    private boolean inICU;

    public Patient (String name, int age, SEVERITY severity, boolean inICU) {
        this.name = name;
        this.age = age;
        this.severity = severity;
        this.inICU = inICU;
    }

    public void markAsICU() {
        this.inICU = true;
    }

    public void updateSeverity(String newSeverity) {
        this.severity = SEVERITY.valueOf(newSeverity);
    }

    @Override
    public String toString() {
        return "PATIENT " + name + "\nAGE : " + age + "\nSEVERITY : " + severity + "\nICU : " + inICU;
    }
}
