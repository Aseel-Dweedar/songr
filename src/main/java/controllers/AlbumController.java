package controllers;

import com.example.songr.models.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import repository.SongrRepository;

@Controller
public class AlbumController {

    @Autowired
    SongrRepository songrRepository;

    @GetMapping("/albums")
    public String getAlbumList(Model model) {
        model.addAttribute("Albums" , songrRepository.findAll());
        return "albums.html";
    }

    @PostMapping("/postaddalbum")
    public RedirectView  addِUserData(@ModelAttribute Album album , Model model){
        model.addAttribute("album" , album);
        songrRepository.save(album);
        return new RedirectView("/albums");
    }

    @GetMapping("/addAlbum")
    public String addAlbum(){
        return  "/addAlbum.html";
    }
}
