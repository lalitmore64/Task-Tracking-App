package com.first.tasks.mappers;

import com.first.tasks.domain.dto.TaskDto;
import com.first.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task  task);

}
