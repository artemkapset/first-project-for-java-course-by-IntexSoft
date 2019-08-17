package edu.kapset.studyproject.domain.persons;

import edu.kapset.studyproject.annotation.FileStorage;

@FileStorage(name = "Author")
public class Author extends Person {
    public Author() {
    }

    public Author(Long id, String surname, String givenname) {
        super(id, surname, givenname);
    }

    public Author(Long id, String surname, String givenname, String patronymic) {
        super(id, surname, givenname, patronymic);
    }

    @Override
    public String toString() {
        if (getPatronymic() != null) {
            return "Author{" +
                    "id=" + getId() +
                    ", surname='" + getSurname() + '\'' +
                    ", givenname='" + getGivenname() + '\'' +
                    ", patronymic='" + getPatronymic() + '\'' +
                    '}';
        } else {
            return "Author{" +
                    "id=" + getId() +
                    ", surname='" + getSurname() + '\'' +
                    ", givenname='" + getGivenname() + '\'' +
                    '}';
        }
    }
}
