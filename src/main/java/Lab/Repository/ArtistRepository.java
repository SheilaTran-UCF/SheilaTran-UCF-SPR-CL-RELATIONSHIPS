package Lab.Repository;

import Lab.Model.Artist;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * JPARepository that will be used to preform persistence operations on Artist objects
 */
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    public Artist save(Artist artist);
    public List<Artist> findAll();
}
