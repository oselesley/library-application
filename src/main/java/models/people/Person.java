/*
    Person.java: Abstract class that is extended by all users and is provided
    for extensibility;
*/

package models.people;

import utils.Role;
import java.util.UUID;

public  abstract class Person {
    private UUID id;
    private String firstName;
    private String  lastName;
    private Role role;

    public Person(String firstName, String lastName, Role role) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
