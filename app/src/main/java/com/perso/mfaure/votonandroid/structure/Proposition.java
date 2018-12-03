package com.perso.mfaure.votonandroid.structure;

import java.util.List;

public class Proposition {
    private String nom;
    private String intro;
    private String detail;
    private List<Integer> scores;

    public Proposition(String nom, String intro, String detail, List<Integer> scores) {
        this.nom = nom;
        this.intro = intro;
        this.detail = detail;
        this.scores = scores;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }


    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }
}
