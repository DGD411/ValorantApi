package com.example.springrestwebcontent;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record TeamData(
        @JsonProperty("id") String id,
        @JsonProperty("url") String url,
        @JsonProperty("name") String name,
        @JsonProperty("img") String img,
        @JsonProperty("country") String country
) {}
