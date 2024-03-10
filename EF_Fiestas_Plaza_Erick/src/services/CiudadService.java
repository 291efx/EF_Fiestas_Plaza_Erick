package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadService {
    @Autowired
    private CiudadRepository ciudadRepository;
    
    public List<Ciudad> obtenerTodasLasCiudades() {
        return ciudadRepository.findAll();
    }
    
    public Ciudad obtenerCiudadPorCodigoPostal(String codigoPostal) {
        return ciudadRepository.findById(codigoPostal).orElse(null);
    }
    
    public void guardarCiudad(Ciudad ciudad) {
        ciudadRepository.save(ciudad);
    }
    
    public void eliminarCiudadPorCodigoPostal(String codigoPostal) {
        ciudadRepository.deleteById(codigoPostal);
    }
    
}

