package edu.kapset.studyproject.domain.persons;

import edu.kapset.studyproject.annotation.FileStorage;

@FileStorage(name = "Client")
public class Client extends Person {

    //TODO - List<Issue> issues ("взятые клиентом издания") - ?

    public Client() {
    }

    public Client(Long id, String surname, String givenname) {
        super(id, surname, givenname);
    }

    public Client(Long id, String surname, String givenname, String patronymic) {
        super(id, surname, givenname, patronymic);
    }

    @Override
    public String toString() {
        if (getPatronymic() != null) {
            return "Client{" +
                    "id=" + getId() +
                    ", surname='" + getSurname() + '\'' +
                    ", givenname='" + getGivenname() + '\'' +
                    ", patronymic='" + getPatronymic() + '\'' +
                    '}';
        } else {
            return "Client{" +
                    "id=" + getId() +
                    ", surname='" + getSurname() + '\'' +
                    ", givenname='" + getGivenname() + '\'' +
                    '}';
        }
    }
}
