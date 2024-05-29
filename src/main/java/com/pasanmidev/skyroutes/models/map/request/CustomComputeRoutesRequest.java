package com.pasanmidev.skyroutes.models.map.request;

import org.jetbrains.annotations.NotNull;

import lombok.Data;


@Data
public class CustomComputeRoutesRequest {
    @NotNull  private MapAddress2 origin;
    @NotNull private MapAddress2 destination;

    public CustomComputeRoutesRequest(@NotNull MapAddress2 origin, @NotNull MapAddress2 destination) {
        this.origin = origin;
        this.destination = destination;
    }
}
