/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comments;

import Users.User;

/**
 *
 * @author 9552
 */
public class Comment {
    private int Id;
    private User User;
    private String Comment;

    public int getId() {
        return Id;
    }

    public User getUser() {
        return User;
    }

    public String getComment() {
        return Comment;
    }

    public Comment(int Id, User User, String Comment) {
        this.Id = Id;
        this.User = User;
        this.Comment = Comment;
    }

    public Comment() {
        this(0,new User(),"");

    }
    
    
}
