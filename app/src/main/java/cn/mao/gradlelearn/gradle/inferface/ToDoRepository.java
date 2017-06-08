package cn.mao.gradlelearn.gradle.inferface;

import java.util.List;

import cn.mao.gradlelearn.gradle.domain.ToDoItem;

/**
 * Created by zhangkun on 2017/4/5.
 */

public interface ToDoRepository {
    List<ToDoItem> findAll();
    ToDoItem findById(Long id);
    Long insert(ToDoItem toDoItem);
    void update(ToDoItem toDoItem);
    void delete(ToDoItem toDoItem);
}
