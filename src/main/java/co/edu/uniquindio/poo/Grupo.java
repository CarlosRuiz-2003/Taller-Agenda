package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
public class Grupo {
    private final String nombre;
    public Collection<Contacto> contactos;
    private final byte maximoContactos;
    private final TipoGrupo tipoGrupo;

    public Grupo (String nombre, String listaContactos, byte maximoContactos, TipoGrupo tipoGrupo){
        

        this.nombre = nombre;
        this.maximoContactos = maximoContactos;
        this.tipoGrupo = tipoGrupo;
        this.contactos = new LinkedList <>();


    }

    public String getNombre() {
        return nombre;
    }

    

    public byte getMaximoContactos() {
        return maximoContactos;
    }

    public TipoGrupo getTipoGrupo() {
        return tipoGrupo;
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
        var grupoUno = new GrupoUno("FAMILIA");
        var grupoDos = new GrupoDos("AMIGOS");
        var grupoTres = new GrupoTres("FIESTA");
        var grupoCuatro = new GrupoCuatro("OFICINA");
        var Contacto = contactos;

        grupo.registrarGrupo(contactos);

        assertTrue(grupoUno.contactos().contains(contactos));
        assertSquals(5, grupoUno.contactos().size());

    }
    public boolean verificarContacto(String nombre, String telf) {
        boolean centinela = false;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelf().equals(telf)) {
                 centinela = true;
            }
        }
        return centinela;
    }
   
    public void eliminarContacto(String nombre, String telf) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelf().equals(telf)) {
                contactos.remove(contacto);
                break;
            }
        }
    }
    public enum TipoGrupo {
        FAMILIA,
        FIESTA,
        OFICINA,
        AMIGOS;

    public Collection<Contacto> getContactos() {
        return Collections.unmodifiableCollection (Contacto);
    }


   
}
    




