package models;

import javax.persistence.*;

@Entity
@Table(name = "tb_detalle_venta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "codigo_postal_destino")
    private String codigoPostalDestino;
    
    @Column(name = "codigo_postal_origen")
    private String codigoPostalOrigen;
    
    @ManyToOne
    @JoinColumn(name = "id_venta")
    private Venta venta;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoPostalDestino() {
        return codigoPostalDestino;
    }

    public void setCodigoPostalDestino(String codigoPostalDestino) {
        this.codigoPostalDestino = codigoPostalDestino;
    }

    public String getCodigoPostalOrigen() {
        return codigoPostalOrigen;
    }

    public void setCodigoPostalOrigen(String codigoPostalOrigen) {
        this.codigoPostalOrigen = codigoPostalOrigen;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
}

