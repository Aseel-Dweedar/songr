package controllers;

import com.example.songr.models.Album;
import com.example.songr.models.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import repository.AlbumsRepository;
import repository.SongRepository;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumsRepository albumsRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/albums")
    public String getAlbumList(Model model) {
        model.addAttribute("Albums" , albumsRepository.findAll());
        return "albums.html";
    }

    @PostMapping("/postaddalbum")
    public RedirectView  addِUserData(@ModelAttribute Album album , Model model){
        model.addAttribute("album" , album);
        albumsRepository.save(album);
        return new RedirectView("/albums");
    }

    @GetMapping("/oneAlbum")
    public String getOneAlbum(@RequestParam Integer id , Model model){
        Album albumToRender = albumsRepository.findById(id).get();
        model.addAttribute("album" , albumToRender);
        List<Song> albumSongs = songRepository.findAllByAlbum(albumToRender);
        model.addAttribute("songs" , albumSongs);
        return "oneAlbum.html";
    }
}
