package PeopleLesson;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Не указано Имя");
        } else {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalStateException("Не указана фамилия");
        } else {
            this.surname = surname;
        }
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (this.age < 0) {
            throw new IllegalArgumentException("Введен не корректный возраст!");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        /*if (name == null || surname == null) {
            throw new IllegalStateException("Не указано Имя или Фамилия");
        }*/
        if (age < 0) {
            throw new IllegalArgumentException("Введен не корректный возраст!");
        }
        return new Person(name, surname, age, city);
    }
}
