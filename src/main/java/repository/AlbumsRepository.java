package repository;

import com.example.songr.models.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumsRepository extends CrudRepository<Album,Integer> {
}
