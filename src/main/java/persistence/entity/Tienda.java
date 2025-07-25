package persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tiendas")
public class Tienda {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    @OneToMany(mappedBy = "tienda")
    private List<Producto> productos;
}
