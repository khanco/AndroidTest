package com.example.test.screens.starcharacterlist.mvvm.models;

import com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class StarCharacterList {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("previous")
    @Expose
    private Object previous;
    @SerializedName("results")
    @Expose
    private List<StarCharacter> starCharacters = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public List<StarCharacter> getStarCharacters() {
        return starCharacters;
    }

    public void setStarCharacters(List<StarCharacter> starCharacters) {
        this.starCharacters = starCharacters;
    }
}
