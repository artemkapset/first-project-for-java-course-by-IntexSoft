package edu.kapset.studyproject.domain.persons;

import edu.kapset.studyproject.annotation.FileStorage;

@FileStorage(name = "Author")
public class Author extends Person {
    public Author() {
    }

    public Author(String surname, String givenname) {
        super(surname, givenname);
    }

    public Author(String surname, String givenname, String patronymic) {
        super(surname, givenname, patronymic);
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
