package org.itstep.springshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AlbumController {
    @Autowired
    AlbumService albumService;

    @GetMapping(value="/album")
    public List<Album> findAll(){
        return albumService.findAll();
    }

    @GetMapping(value="/album/{id}")
    public Optional<Album> findById(@PathVariable Long id){
        return albumService.findById(id);
    }

    @PostMapping(value="/album")
    Album createOrSave(@RequestBody Album album) {
        //System.out.println(artist.getName());
        return
                albumService.save
                        (album);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    class InvalidRequestException extends RuntimeException{
        public InvalidRequestException (String s){super(s);}}

    @PutMapping(value="/album/{id}")
    Album update(@RequestBody Album newAlbum, @PathVariable Long id) {
        return albumService.findById(id).map(Album -> {
            Album.setTitle(newAlbum.getTitle());
            /*Artist.setColor(newArtist.getColor());
            Artist.setPrice(newArtist.getPrice());
            Artist.setPriceNew(newArtist.getPriceNew());*/
            return
                    albumService.save
                            (Album);
        }).orElse(null);
    }

    @DeleteMapping(value="/album/{id}")
    void deleteById(@PathVariable Long id) {
        albumService.deleteById(id);
       // System.out.println("delete");
    }
}
