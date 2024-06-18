package com.pasanmidev.skyroutes.models.weather;

import java.util.List;

import lombok.Data;

@Data
public class OpenWeatherResponse {
    private double lat;
    private double lon;
    private String timezone;
    private long timezone_offset;
    private List<WeatherData> data;

    public OpenWeatherResponse() {
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public long getTimezone_offset() {
        return timezone_offset;
    }

    public void setTimezone_offset(long timezone_offset) {
        this.timezone_offset = timezone_offset;
    }

    public List<WeatherData> getData() {
        return data;
    }

    public void setData(List<WeatherData> data) {
        this.data = data;
    }

}
