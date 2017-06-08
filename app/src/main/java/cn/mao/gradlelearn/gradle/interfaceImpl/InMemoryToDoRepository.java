package cn.mao.gradlelearn.gradle.interfaceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import cn.mao.gradlelearn.gradle.domain.ToDoItem;
import cn.mao.gradlelearn.gradle.inferface.ToDoRepository;

/**
 * Created by zhangkun on 2017/4/5.
 */

public class InMemoryToDoRepository implements ToDoRepository {

    private AtomicLong cuurrentId = new AtomicLong();

    private ConcurrentMap<Long,ToDoItem> toDos = new ConcurrentHashMap<>();
    @Override
    public List<ToDoItem> findAll() {
        List<ToDoItem> toDoItems = new ArrayList<>(toDos.values());
        Collections.sort(toDoItems);
        return null;
    }

    @Override
    public ToDoItem findById(Long id) {
        return toDos.get(id);
    }

    @Override
    public Long insert(ToDoItem toDoItem) {
        Long id = cuurrentId.incrementAndGet();
        toDoItem.setId(id);
        toDos.putIfAbsent(id,toDoItem);
        return id;
    }

    @Override
    public void update(ToDoItem toDoItem) {

        toDos.replace(toDoItem.getId(),toDoItem);

    }

    @Override
    public void delete(ToDoItem toDoItem) {

        toDos.remove(toDoItem.getId());

    }
}
