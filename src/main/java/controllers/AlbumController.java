package controllers;

import models.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {

    private int length;
    private String imageUrl;

    @GetMapping("/albums")
    public String getAlbumList(Model model) {
        Album album1 = new Album("Sound of a Rebel" , "Outlandish" ,12, 2880 , "https://img.discogs.com/TbBCl60Zu9rSA9clP6VexTCjYS8=/fit-in/600x593/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-3609447-1363460601-3129.jpeg.jpg" );
        Album album2 = new Album("Dari Ya Alby" , "hamza namira" ,10, 2500 , "https://i1.sndcdn.com/artworks-000299447418-6z909k-t500x500.jpg" );
        Album album3 = new Album("The Centre" , "Sami Yusuf" ,13, 2950 , "https://play.samaanetwork.net/wp-content/uploads/edd/2018/12/cover.jpg" );
        List<Album> allAlbums = new ArrayList<>();
        allAlbums.add(album1);
        allAlbums.add(album2);
        allAlbums.add(album3);
        model.addAttribute("Albums" , allAlbums);
        return "albums.html";
    }

}
