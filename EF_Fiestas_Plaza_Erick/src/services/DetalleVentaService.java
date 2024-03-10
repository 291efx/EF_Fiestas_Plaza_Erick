package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleVentaService {
    @Autowired
    private DetalleVentaRepository detalleVentaRepository;
    
    public void guardarDetalleVenta(DetalleVenta detalleVenta) {
        detalleVentaRepository.save(detalleVenta);
    }
    
    public DetalleVenta obtenerDetalleVentaPorId(Long id) {
        return detalleVentaRepository.findById(id).orElse(null);
    }
    
    public List<DetalleVenta> obtenerTodosLosDetallesVenta() {
        return detalleVentaRepository.findAll();
    }
    
    public void eliminarDetalleVentaPorId(Long id) {
        detalleVentaRepository.deleteById(id);
    }
    
}
