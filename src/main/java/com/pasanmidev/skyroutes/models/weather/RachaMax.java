
package com.pasanmidev.skyroutes.models.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class RachaMax {
    @SerializedName("@attributes")
    @Expose
    private Attributes__4 attributes;

    public RachaMax() {
    }

    public Attributes__4 getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes__4 attributes) {
        this.attributes = attributes;
    }
}
