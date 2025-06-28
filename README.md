# Описание приложения "Трекер пользователей"

## Условие задачи
Создать небольшое Java web-приложение на основе Spring Boot со
следующим функционалом:
- при обращении по эндпойнту “user-api/v1/users” (GET метод)
  приложение возвращает json-ответ со списком всех доступных
  пользователей;
- при обращении по эндпойнту “user-api/v1/users” (POST метод)
  происходит добавление нового пользователя с заданными
  параметрами.
<p>
  Пользователь описывается сущностью User с полями (Long id, String
  firstName, String lastName, Role role), Role – это enum с возможными
  значениями (ADMIN, DEVELOPER, TESTER, SYSTEM_ANALYST,
  TEAM_LEAD). 
<p>


## Выполнение задания
> [__Содержимое класса User__](SpringApp/src/main/java/mephi/digitalfaculty/SpringApp/model/User.java) `User`<br>
> [__Содержимое класса UserRepository__](SpringApp/src/main/java/mephi/digitalfaculty/SpringApp/repository/UserRepository.java) `UserRepository`<br>
> [__Содержимое класса UserService__](SpringApp/src/main/java/mephi/digitalfaculty/SpringApp/service/UserService.java) `UserService`<br>
> [__Содержимое класса UserController__](SpringApp/src/main/java/mephi/digitalfaculty/SpringApp/controller/UserController.java) `UserController`<br>
