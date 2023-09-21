package Lab.Repository;

import Lab.Model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * JPARepository that will be used to preform persistence operations on Album objects
 */
public interface AlbumRepository extends JpaRepository<Album, Long> {
    public Album save(Album album);
    public List<Album> findAll();
}
