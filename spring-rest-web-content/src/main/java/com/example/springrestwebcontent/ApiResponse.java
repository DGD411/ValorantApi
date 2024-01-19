package com.example.springrestwebcontent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ApiResponse(
        String status,
        String region,
        int size,
        Pagination pagination,
        TeamData[] data
) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record Pagination(
        int page,
        int limit,
        int totalElements,
        int totalPages,
        boolean hasNextPage
) {}
