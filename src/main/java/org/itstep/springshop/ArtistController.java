package org.itstep.springshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("api")
public class ArtistController {
    @Autowired
    ArtistService artistService;

    @GetMapping(value="/artist")
    public List<Artist> findAll(){
        return artistService.findAll();
    }

    @GetMapping(value="/artist/{id}")
    public Optional<Artist> findById(@PathVariable Long id){
        return artistService.findById(id);
    }

    @PostMapping(value="/artist")
    Artist createOrSave(@RequestBody Artist artist) {
        //System.out.println(artist.getName());
        return
                artistService.save
                        (artist);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    class InvalidRequestException extends RuntimeException{
    public InvalidRequestException (String s){super(s);}}

    @PutMapping(value="/artist/{id}")
    Artist update(@RequestBody Artist newArtist, @PathVariable Long id) {
        return artistService.findById(id).map(Artist -> {
            Artist.setName(newArtist.getName());
            /*Artist.setColor(newArtist.getColor());
            Artist.setPrice(newArtist.getPrice());
            Artist.setPriceNew(newArtist.getPriceNew());*/
            return
                    artistService.save
                            (Artist);
        }).orElse(null);
    }

    @DeleteMapping(value="/artist/{id}")
    void deleteById(@PathVariable Long id) {
        artistService.deleteById(id);
       // System.out.println("delete");
    }
}
