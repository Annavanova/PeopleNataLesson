## PeopleNataLesson
### Задача Люди
#### Описание
В этом задании попрактикуемся с шаблоном Builder (Строитель). Мы спроектируем класс Person, в котором будут храниться данные о человеке:

- Имя (String). Каждый человек обязан иметь имя, причём с момента создания объекта изменить его нельзя.
- Фамилия (String). Каждый человек обязан иметь фамилию, причём с момента создания объекта изменить её нельзя.
- Возраст (int). Если возраст человека известен, то с момента создания объекта он может быть изменён только увеличением на единицу через вызов метода happyBirthday(). Возраст человека может быть неизвестен, в этом случае метод boolean hasAge() должен вернуть false, иначе - true. Подумайте, как эффективнее хранить в объекте информацию о том, известен ли возраст человека.
- Текущий город жительства (String). Может быть известен (в этом случае метод boolean hasAddress() должен вернуть true, иначе - false) и выставлен в любой через setAddress(String city).
