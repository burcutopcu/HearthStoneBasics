package com.burcutopcu.hearthstonebasics.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GeneralInfoModel {

    @SerializedName("patch")
    @Expose
    private String patch;
    @SerializedName("classes")
    @Expose
    private List<String> classes = null;
    @SerializedName("sets")
    @Expose
    private List<String> sets = null;
    @SerializedName("standard")
    @Expose
    private List<String> standard = null;
    @SerializedName("wild")
    @Expose
    private List<String> wild = null;
    @SerializedName("types")
    @Expose
    private List<String> types = null;
    @SerializedName("factions")
    @Expose
    private List<String> factions = null;
    @SerializedName("qualities")
    @Expose
    private List<String> qualities = null;
    @SerializedName("races")
    @Expose
    private List<String> races = null;
    @SerializedName("locales")
    @Expose
    private List<String> locales = null;

    public String getPatch() {
        return patch;
    }

    public void setPatch(String patch) {
        this.patch = patch;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public List<String> getSets() {
        return sets;
    }

    public void setSets(List<String> sets) {
        this.sets = sets;
    }

    public List<String> getStandard() {
        return standard;
    }

    public void setStandard(List<String> standard) {
        this.standard = standard;
    }

    public List<String> getWild() {
        return wild;
    }

    public void setWild(List<String> wild) {
        this.wild = wild;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getFactions() {
        return factions;
    }

    public void setFactions(List<String> factions) {
        this.factions = factions;
    }

    public List<String> getQualities() {
        return qualities;
    }

    public void setQualities(List<String> qualities) {
        this.qualities = qualities;
    }

    public List<String> getRaces() {
        return races;
    }

    public void setRaces(List<String> races) {
        this.races = races;
    }

    public List<String> getLocales() {
        return locales;
    }

    public void setLocales(List<String> locales) {
        this.locales = locales;
    }


}
