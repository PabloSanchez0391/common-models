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

    @Data
    public class WeatherData {
        private long dt;
        private long sunrise;
        private long sunset;
        private double temp;
        private double feels_like;
        private long pressure;
        private long humidity;
        private double dev_point;
        private double uvi;
        private long clouds;
        private long visibility;
        private double wind_speed;
        private long wind_deg;
        private double wind_gust;
        private List<Weather> weather;

        public long getDt() {
            return dt;
        }

        public void setDt(long dt) {
            this.dt = dt;
        }

        public long getSunrise() {
            return sunrise;
        }

        public void setSunrise(long sunrise) {
            this.sunrise = sunrise;
        }

        public long getSunset() {
            return sunset;
        }

        public void setSunset(long sunset) {
            this.sunset = sunset;
        }

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getFeels_like() {
            return feels_like;
        }

        public void setFeels_like(double feels_like) {
            this.feels_like = feels_like;
        }

        public long getPressure() {
            return pressure;
        }

        public void setPressure(long pressure) {
            this.pressure = pressure;
        }

        public long getHumidity() {
            return humidity;
        }

        public void setHumidity(long humidity) {
            this.humidity = humidity;
        }

        public double getDev_point() {
            return dev_point;
        }

        public void setDev_point(double dev_point) {
            this.dev_point = dev_point;
        }

        public double getUvi() {
            return uvi;
        }

        public void setUvi(double uvi) {
            this.uvi = uvi;
        }

        public long getClouds() {
            return clouds;
        }

        public void setClouds(long clouds) {
            this.clouds = clouds;
        }

        public long getVisibility() {
            return visibility;
        }

        public void setVisibility(long visibility) {
            this.visibility = visibility;
        }

        public double getWind_speed() {
            return wind_speed;
        }

        public void setWind_speed(double wind_speed) {
            this.wind_speed = wind_speed;
        }

        public long getWind_deg() {
            return wind_deg;
        }

        public void setWind_deg(long wind_deg) {
            this.wind_deg = wind_deg;
        }

        public double getWind_gust() {
            return wind_gust;
        }

        public void setWind_gust(double wind_gust) {
            this.wind_gust = wind_gust;
        }

        public List<Weather> getWeather() {
            return weather;
        }

        public void setWeather(List<Weather> weather) {
            this.weather = weather;
        }

        @Data
        public class Weather {
            private long id;
            private String main;
            private String description;
            private String icon;

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
