package controllers;

import com.example.songr.models.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import repository.AlbumsRepository;

@Controller
public class AlbumController {

    @Autowired
    AlbumsRepository albumsRepository;

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
}
