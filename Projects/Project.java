/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Project {
    private int Id;
    private String Nombre;
    private List listaTarea;

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public List getListaTarea() {
        return listaTarea;
    }

    public Project(int Id, String Nombre) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.listaTarea = new ArrayList();
    }

    public Project() {
        this(0, "" );
    }
    
    
    
}
