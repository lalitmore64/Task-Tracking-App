package com.first.tasks.mappers;

import com.first.tasks.domain.dto.TaskListDto;
import com.first.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList  fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList  taskList);
}
