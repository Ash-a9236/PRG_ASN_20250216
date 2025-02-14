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
        return "\n\nPATIENT " + name + "\n   AGE : " + age + "\n   SEVERITY : " + severity + "\n   ICU : " + inICU;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SEVERITY getSeverity() {
        return severity;
    }

    public void setSeverity(SEVERITY severity) {
        this.severity = severity;
    }

    public boolean isInICU() {
        return inICU;
    }

    public void setInICU(boolean inICU) {
        this.inICU = inICU;
    }
}
