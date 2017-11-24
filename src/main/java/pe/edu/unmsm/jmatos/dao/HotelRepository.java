package pe.edu.unmsm.jmatos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.unmsm.jmatos.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

	@Query("SELECT h FROM Hotel h where h.idDestino = :codDestino ")
	public List<Hotel> findHotelByIdDestino(@Param("codDestino") Integer codDestino) throws Exception;
}
 