package pe.edu.unmsm.jmatos.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.unmsm.jmatos.dao.HotelRepository;
import pe.edu.unmsm.jmatos.dto.HotelDTO;
import pe.edu.unmsm.jmatos.dto.in.BuscarHotelesParam;
import pe.edu.unmsm.jmatos.exception.DestinoIdEmptyException;
import pe.edu.unmsm.jmatos.exception.HotelesNotFound;
import pe.edu.unmsm.jmatos.model.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	 
	@Override
	public List<HotelDTO> findHoteles(BuscarHotelesParam param) throws HotelesNotFound, DestinoIdEmptyException, Exception {
		// TODO Auto-generated method stub
		List<HotelDTO> hotelesDTO = null;
		List<Hotel> hoteles = hotelRepository.findHotelByIdDestino(param.getIdDestino());
		if(hoteles.isEmpty()) throw new HotelesNotFound();
		hotelesDTO = new ArrayList<HotelDTO>();
		for(Hotel hotel:hoteles){
			HotelDTO hotelDTO = new HotelDTO();
			BeanUtils.copyProperties(hotelDTO, hotel);
			hotelesDTO.add(hotelDTO);
		}
		return hotelesDTO;
	}

}
