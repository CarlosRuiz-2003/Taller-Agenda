package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.LinkedList;

public class Grupo {
    public String nombre;
    public byte maximoContactos = 5;
    public TipoGrupo categoria;
    public Collection<Grupo> grupos;
    public Contacto contacto;


    public Grupo (String nombre, byte maximoContactos, TipoGrupo categoria){
        this.nombre = nombre;
        this.maximoContactos = maximoContactos;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getMaximoContactos() {
        return maximoContactos;
    }

    public TipoGrupo getcategoria() {
        return categoria;
    }

    public record GrupoUno(String nombre){

    }
    public record GrupoDos(String nombre){

    }
    public record GrupoTres(String nombre){

    }
    public record GrupoCuatro (String nombre){

    }




    public void registrarGrupo(){
        // var grupoUno = new GrupoUno("FAMILIA");
        // var grupoDos = new GrupoDos("AMIGOS");
        // var grupoTres = new GrupoTres("FIESTA");
        // var grupoCuatro = new GrupoCuatro("OFICINA");
        // var Contacto = contactos;

        // grupo.registrarGrupo(contactos);

        assertTrue(grupoUno.contactos().contains(contactos));
        assertSquals(5, grupoUno.contactos().size());
    }
   
    public void eliminarGrupo(String nombre) {
        for (Grupo grupo : grupos) {
            if (grupo.getNombre().equals(nombre)) {
                grupos.remove(grupo);
                break;
            }
        }
    }

    public enum TipoGrupo {
        FAMILIA,
        FIESTA,
        OFICINA,
        AMIGOS;
    }
    // public Collection<Contacto> getContactos() {
    //     return contactos.unmodifiableCollection(contactos);
    // }
}
    




