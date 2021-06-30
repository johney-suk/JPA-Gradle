package org.zerock.j07.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.zerock.j07.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo,Long> {

    @Modifying
    @Query("update Todo set content =:content where tno =:tno")
    void updateContent(String content, Long tno);
}
