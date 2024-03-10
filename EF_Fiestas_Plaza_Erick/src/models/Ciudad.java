package models;

import javax.persistence.*;

@Entity
@Table(name = "tb_ciudad")
public class Ciudad {
    @Id
    @Column(name = "codigo_postal")
    private String codigoPostal;
    
    @Column(name = "nombre")
    private String nombre;
    
    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
