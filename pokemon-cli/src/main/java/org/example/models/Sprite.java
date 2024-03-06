package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sprite {
    @JsonProperty("back_default") // maps this attribute to JSON
    private String backDefault;
    @JsonProperty("front_default") // maps this attribute to JSON
    private String frontDefault;

    public String getBackDefault() {
        return backDefault;
    }

    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    @Override
    public String toString() {
        return "Sprite{" +
                "backDefault='" + backDefault + '\'' +
                ", frontDefault='" + frontDefault + '\'' +
                '}';
    }
}
