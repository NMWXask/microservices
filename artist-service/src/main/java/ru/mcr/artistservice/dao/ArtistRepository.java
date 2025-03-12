package ru.mcr.artistservice.dao;

import org.springframework.stereotype.Repository;
import ru.mcr.artistservice.dto.ArtistRequestDto;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ArtistRepository {

    public ArtistRequestDto getById(String id) {
        Map<String, ArtistRequestDto> map = getArtistData();
        return map.get(id);
    }

    public Map <String, ArtistRequestDto> getArtistData() {
        Map <String, ArtistRequestDto> artistData = new HashMap<>();
        artistData.put("1", new ArtistRequestDto(1L, "Limp Bizkits", "Alternative", "2024-12-12T20:00"));
        artistData.put("2", new ArtistRequestDto(2L, "Linkin Park", "Alternative", "2024-12-12T22:00"));
        artistData.put("3", new ArtistRequestDto(3L, "Slipknot", "Metal", "2024-12-12T00:00"));
        artistData.put("4", new ArtistRequestDto(4L, "Imagine Dragons", "Rock", "2024-12-12T00:00"));

        return artistData;
    }
}
