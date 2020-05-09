package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    @Column (name = "nombre")
    private String nombre;
    
    @Column (name = "apellido")
    private String apellido;
    
    @Column (name = "email")
    private String email;
    
    @Column (name = "telefono")
    private String telefono;
}
