package edu.kapset.studyproject.domain.persons;

import edu.kapset.studyproject.annotation.FileStorage;

@FileStorage(name = "Librarian")
public class Librarian extends Person {

    private Integer category;

    public Librarian() {
    }

    public Librarian(Long id, String surname, String givenname, Integer category) {
        super(id, surname, givenname);
        this.category = category;
    }

    public Librarian(Long id, String surname, String givenname, String patronymic, Integer category) {
        super(id, surname, givenname, patronymic);
        this.category = category;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public String toString() {
        if (getPatronymic() != null) {
            return "Librarian{" +
                    "id=" + getId() +
                    ", surname='" + getSurname() + '\'' +
                    ", givenname='" + getGivenname() + '\'' +
                    ", patronymic='" + getPatronymic() + '\'' +
                    ", category='" + getCategory() + '\'' +
                    '}';
        } else {
            return "Librarian{" +
                    "id=" + getId() +
                    ", surname='" + getSurname() + '\'' +
                    ", givenname='" + getGivenname() + '\'' +
                    ", category='" + getCategory() + '\'' +
                    '}';
        }
    }
}
