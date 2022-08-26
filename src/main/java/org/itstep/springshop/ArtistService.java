package org.itstep.springshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    public List<Artist> findAll(){return artistRepository.findAll();}
    public Optional<Artist> findById(Long id){return artistRepository.findById(id);}
    public Artist save(Artist artist){return artistRepository.save(artist);}
    public void deleteById(Long id){
        artistRepository.deleteById(id);
    }
}