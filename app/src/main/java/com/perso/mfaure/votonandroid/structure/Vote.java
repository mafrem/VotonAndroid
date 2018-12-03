package com.perso.mfaure.votonandroid.structure;

import java.util.List;

public class Vote {
    private List<Proposition> propositions;
    private String pass;
    private String nom;
    private String resume;
    private List<String> notes;

    public Vote(List<Proposition> propositions, String pass, String nom, String resume, List<String> notes) {
        this.propositions = propositions;
        this.pass = pass;
        this.nom = nom;
        this.resume = resume;
        this.notes = notes;
    }

    public List<Proposition> getPropositions() {
        return propositions;
    }

    public void setPropositions(List<Proposition> propositions) {
        this.propositions = propositions;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

}
