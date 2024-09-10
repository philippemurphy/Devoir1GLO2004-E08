package org.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Clinic {

    private Queue<Patient> doctorsQ = new Queue<Patient>() {
        @Override
        public boolean add(Patient patient) {
            return false;
        }

        @Override
        public boolean offer(Patient patient) {
            return false;
        }

        @Override
        public Patient remove() {
            return null;
        }

        @Override
        public Patient poll() {
            return null;
        }

        @Override
        public Patient element() {
            return null;
        }

        @Override
        public Patient peek() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Patient> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Patient> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

    };
    private Queue<Patient> radiologyQ;

    public void meetPatient()
    {

    }

    public boolean docstorsQIsEmpty()
    {
        return true;
    }

    public Clinic(/* ... */) {
    }

    public void triagePatient(String name, int gravity, VisibleSymptom visibleSymptom) {
        // TODO
    }

    public void addPatientToDoctorsQ(Patient patient)
    {
        doctorsQ.add(patient);
    }

    public boolean isEmpty()
    {
        return doctorsQ.isEmpty();
    }


    // D'autres méthodes peuvent être nécessaires
}

/*
Scénario 1: Celui où un patient se présente à la clinique avec une migraine
Lorsqu'un patient se présente avec MIGRAINE (peu importe la gravité)
Alors il est le premier dans la file d'attente du médecin
Et il n'est pas dans la file d'attente de la radiologie

Scénario 2: Celui où 2 patients se présentent à la clinique
Étant donné qu'il y a un patient dans la file d'attente du médecin
Lorsqu'un patient se présente avec FLU (peu importe la gravité)
Alors il est le deuxième dans la file d'attente du médecin
Et il n'est pas dans la file d'attente de la radiologie

Scénario 3: Celui où un patient se présente à la clinique avec une entorse
Lorsqu'un patient se présente avec SPRAIN (peu importe la gravité)
Alors il est le premier dans la file d'attente du médecin
Et il est la première dans la file d'attente de la radiologie*/
