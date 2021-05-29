package entity;

public class Todolist {
    private String todo;

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Todolist() {
    }

    public Todolist(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
