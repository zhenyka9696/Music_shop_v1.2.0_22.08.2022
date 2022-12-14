package org.itstep.springshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {
    @Autowired
    AlbumRepository albumRepository;

    public List<Album> findAll(){return albumRepository.findAll();}

    public Optional<Album> findById(Long id){return albumRepository.findById(id);}

    public Album save(Album album){return albumRepository.save(album);}


    public void deleteById(Long id){albumRepository.deleteById(id);
    }
}
