package com.pasanmidev.skyroutes.models.map.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class EncodedPolyline {
    private String encodedPolyline;

    public String getEncodedPolyline() {
        return encodedPolyline;
    }

    public EncodedPolyline(String encodedPolyline) {
        this.encodedPolyline = encodedPolyline;
    }

    public EncodedPolyline() {
    }
}
