/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import Tasks.Task;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Project {
    private int Id;
    private String Nombre;
    private ArrayList<Task> listaTarea;

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public List getArrayListaTarea() {
        return listaTarea;
    }
    public int getNumeroTareas() {
        return listaTarea.size();
    }

    public Project(int Id, String Nombre) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.listaTarea = new ArrayList<>();
    }

    public Project() {
        this(0, "" );
    }
    
     public int getNumeroTareasCompletadas() {
        int completadas = 0;
        for (Task tarea : listaTarea) {
            if (tarea.isCompleted()) {
                completadas++;
            }
        }
        return completadas;
    }

    public double getPorcentajeCompletado() {
        int totalTareas = getNumeroTareas();
        int tareasCompletadas = getNumeroTareasCompletadas();
        if (totalTareas == 0) {
            return 0;
        }
        return ((double) tareasCompletadas / totalTareas) * 100;
    }
    public void find(){
        
    }
}
