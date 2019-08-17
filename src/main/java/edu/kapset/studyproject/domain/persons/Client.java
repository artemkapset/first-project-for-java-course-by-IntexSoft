package edu.kapset.studyproject.domain.persons;

import edu.kapset.studyproject.annotation.FileStorage;

@FileStorage(name = "Client")
public class Client extends Person {

    //TODO - List<Issue> issues ("взятые клиентом издания") - ?

    public Client() {
    }

    public Client(String surname, String givenname) {
        super(surname, givenname);
    }

    public Client(String surname, String givenname, String patronymic) {
        super(surname, givenname, patronymic);
    }

    @Override
    public String toString() {
        if (getPatronymic() != null) {
            return "Client{" +
                    "surname='" + getSurname() + '\'' +
                    ", givenname='" + getGivenname() + '\'' +
                    ", patronymic='" + getPatronymic() + '\'' +
                    '}';
        } else {
            return "Client{" +
                    "surname='" + getSurname() + '\'' +
                    ", givenname='" + getGivenname() + '\'' +
                    '}';
        }
    }
}
