package pe.edu.unmsm.jmatos.service;

import java.util.List;

import pe.edu.unmsm.jmatos.dto.HotelDTO;
import pe.edu.unmsm.jmatos.dto.in.BuscarHotelesParam;
import pe.edu.unmsm.jmatos.exception.DestinoIdEmptyException;

public interface HotelService {

	public List<HotelDTO> findHoteles(BuscarHotelesParam param) throws DestinoIdEmptyException, Exception;
	
}
 