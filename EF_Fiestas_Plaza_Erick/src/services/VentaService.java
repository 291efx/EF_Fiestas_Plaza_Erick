package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;
    
    @Autowired
    private DetalleVentaRepository detalleVentaRepository;
    
    public void guardarVenta(Venta venta, DetalleVenta detalleVenta) {
        ventaRepository.save(venta);
        detalleVentaRepository.save(detalleVenta);
    }
    
    public Venta obtenerVentaPorId(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }
    
    public List<Venta> obtenerTodasLasVentas() {
        return ventaRepository.findAll();
    }
    
    public void eliminarVentaPorId(Long id) {
        ventaRepository.deleteById(id);
    }
    
}
