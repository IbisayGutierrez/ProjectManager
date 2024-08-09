/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Users.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 9552
 */
public class Task {
    private int Id;
    private String Description;
    private boolean Completed;
    private User Usuario;
    private List TaskList;

    public int getId() {
        return Id;
    }

    public String getDescription() {
        return Description;
    }

    public boolean getCompleted() {
        return Completed;
    }

    public User getUsuario() {
        return Usuario;
    }

    public List getTaskList() {
        return TaskList;
    }

    public Task(int Id, String Description, boolean Completed, User Usuario) {
        this.Id = Id;
        this.Description = Description;
        this.Completed = Completed;
        this.Usuario = Usuario;
        this.TaskList =new ArrayList();
    }

    public Task() {
        this(0,"",false,new User());
        
    }
    
}
