package ru.mcr.artistservice.dto;

import lombok.Builder;

import java.io.Serializable;

@Builder
public record ArtistRequestDto(Long id, String name, String genre, String performanceTime) implements Serializable {
}
