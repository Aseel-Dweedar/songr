package repository;

import com.example.songr.models.Album;
import org.springframework.data.repository.CrudRepository;

public interface SongrRepository extends CrudRepository<Album,Integer> {
}
