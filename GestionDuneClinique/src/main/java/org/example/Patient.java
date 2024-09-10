package org.example;
import org.example.VisibleSymptom;

public class Patient {

    private String name;
    private int gravity;
    private VisibleSymptom symptom;

    public Patient(String name, int gravity, VisibleSymptom symptom) {
        this.name = name;
        this.gravity = gravity;
        this.symptom = symptom;
    }
}


