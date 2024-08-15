### Extension


- I want to be able to get a task by a unique ID.
- I want to update the name of a task by providing its ID and a new name.
- I want to be able to change the status of a task by providing its ID.
- I want to be able to see the date and time that I created each task.

| Class    | Variables          | Method                                | Scenario                                       | Outcome                             |
|----------|--------------------|---------------------------------------|------------------------------------------------|-------------------------------------|
| TodoList | ArrayList<Task>    | getTaskById(String id)                | Get the requested task by its Id               | Task                                |
|          |                    |                                       |                                                | "Task with given id does not exist" |
|          |                    | updateTask(String id, String newName) | Change the task name from its ID               | Task.name -> newName                |
|          |                    |                                       |                                                | "Task with given id does not exist" |
|          |                    | changeStatus(String id)               | Change the status of task with ID id           | Task.status -> true/false           |
|          |                    |                                       |                                                | "Task with given id does not exist" |
|          |                    | getDateAndTime(String id)             | Get the date and time of when task was created | Task.dateAndTime                    |
|          |                    |                                       |                                                | "Task with given id does not exist" |
| Task     | String id          | createTask(String name)               | Create a task object                           | "Task created"                      |
|          | boolean isComplete |                                       |                                                | "Error"                             |
|          | String name        | getTaskNameById(String id)            | Get task by ID name                            | "Task 'name'"                       |
|          |                    |                                       |                                                | "Task with 'ID' does not exist"     |
|          |                    | getTaskStatus()                       | Get task status from task                      | "Complete"/ "Incomplete"            |
|          |                    |                                       |                                                | "Task does not exist"               |
|          |                    | changeStatus()                        | Change the current status of task              | isComplete: false -> true           |
|          |                    |                                       |                                                | isComplete: true -> false           |
