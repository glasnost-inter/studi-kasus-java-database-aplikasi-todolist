package repository;

import com.zaxxer.hikari.HikariDataSource;
import entity.Todolist;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.DatabaseUtil;


public class TodolistRepositoryImplTest {

    private HikariDataSource dataSource;
    private TodoListRepository todoListRepository;

    @BeforeEach
    void setUp() {
        dataSource = DatabaseUtil.getHikariDataSource();
        todoListRepository = new TodoListRepositoryImpl(dataSource);
    }

    @Test
    void testAdd() {
        Todolist todolist = new Todolist();
        todolist.setTodo("Farid");

        todoListRepository.add(todolist);
    }

    @Test
    void testRemove() {
        System.out.println(todoListRepository.remove(1));
        System.out.println(todoListRepository.remove(2));
        System.out.println(todoListRepository.remove(3));
        System.out.println(todoListRepository.remove(4));
    }

    @Test
    void testGetAll() {
        todoListRepository.add(new Todolist("Salman"));
        todoListRepository.add(new Todolist("Emi"));
        todoListRepository.add(new Todolist("Azam"));
        todoListRepository.add(new Todolist("Baim"));

        Todolist[] todolists = todoListRepository.getAll();
        for(var todo : todolists){
            System.out.println(todo.getId()+ " . "+todo.getTodo());
        }
    }


    @AfterEach
    void tearDown() {
        dataSource.close();
    }
}
