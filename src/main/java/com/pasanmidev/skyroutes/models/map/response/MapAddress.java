package com.pasanmidev.skyroutes.models.map.response;

import org.jetbrains.annotations.NotNull;

import lombok.Data;

@Data
public class MapAddress {
    @NotNull private String address;

    public MapAddress(@NotNull String address) {
        this.address = address;
    }

    public MapAddress(){}


}
