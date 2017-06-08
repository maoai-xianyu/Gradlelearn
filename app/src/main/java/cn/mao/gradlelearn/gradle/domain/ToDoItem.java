package cn.mao.gradlelearn.gradle.domain;

import android.support.annotation.NonNull;

/**
 * Created by zhangkun on 2017/4/5.
 */

public class ToDoItem implements Comparable<ToDoItem> {

    private Long id;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(@NonNull ToDoItem toDoItem) {
        return 0;
    }
}
