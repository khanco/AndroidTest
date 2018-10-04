package com.example.test.screens.starcharacterdetails.mvvm.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.parceler.Parcel;

@Parcel(Parcel.Serialization.BEAN)
public class StarCharacter {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("height")
    @Expose
    private String height;

    @SerializedName("mass")
    @Expose
    private String mass;

    @SerializedName("birth_year")
    @Expose
    private String birthYear;

    @SerializedName("created")
    @Expose
    private String created;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
