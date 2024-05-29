package com.pasanmidev.skyroutes.models.map.request;

import org.jetbrains.annotations.NotNull;

import lombok.Data;

@Data
public class MapAddress2 {
    @NotNull private Location location;

    public MapAddress2(@NotNull Location location) {
        this.location = location;
    }

    public MapAddress2(){}


}
