package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/transaccion")
public class TransaccionController {
    @Autowired
    private CiudadService ciudadService;

    @Autowired
    private VentaService ventaService;

    @PostMapping("/realizar")
    public void realizarTransaccion(@RequestBody TransaccionRequest request) {
        String ciudadOrigen = request.getCiudadOrigen();
        String ciudadDestino = request.getCiudadDestino();
        int cantidad = request.getCantidad();

        double montoTotal = cantidad * 50;

        Venta venta = new Venta();
        venta.setNombreComprador("Cliente");
        venta.setFechaVenta(new Date());
        venta.setMontoTotal(montoTotal);

        DetalleVenta detalleVenta = new DetalleVenta();
        detalleVenta.setCodigoPostalOrigen(ciudadOrigen);
        detalleVenta.setCodigoPostalDestino(ciudadDestino);
        detalleVenta.setCantidad(cantidad);
        detalleVenta.setFechaViaje(new Date());
        detalleVenta.setFechaRetorno(new Date());
        detalleVenta.setSubTotal(montoTotal);

        ventaService.guardarVenta(venta, detalleVenta);
    }

    @GetMapping("/ciudades")
    public List<Ciudad> obtenerCiudades() {
        return ciudadService.obtenerTodasLasCiudades();
    }
}

