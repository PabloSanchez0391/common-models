package com.pasanmidev.skyroutes.models.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CotaNieveProv {
    @SerializedName("@attributes")
    @Expose
    private Attributes__4 attributes;

    public CotaNieveProv() {
    }

    public Attributes__4 getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes__4 attributes) {
        this.attributes = attributes;
    }
}
