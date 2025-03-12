package ru.mcr.artistservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mcr.artistservice.dao.ArtistRepository;
import ru.mcr.artistservice.dto.ArtistRequestDto;

@Service
@RequiredArgsConstructor
public class ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistRequestDto findById(String id) {
        return artistRepository.getById(id);
    }
}
