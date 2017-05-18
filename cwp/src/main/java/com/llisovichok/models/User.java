package com.llisovichok.models;

import com.llisovichok.lessons.clinic.Client;
import com.llisovichok.lessons.clinic.Pet;

/**
 * Created by ALEKSANDR KUDIN on 23.03.2017.
 */
public class User extends Client {

    private int id;

    public User(final String firstName, final Pet pet) {
        super(firstName, pet);
    }

    public User(final String firstName, final String lastName) {
        super(firstName, lastName);
    }

    public User(final String firstName, final String lastName, final String address, final long phoneNumber) {
        super(firstName, lastName, address, phoneNumber);
    }

    public User(final String firstName, final String lastName, final Pet pet) {
        super(firstName, lastName, pet);
    }

    public User(final String firstName, final String lastName, final String address, final long phoneNumber, final Pet pet) {
        super(firstName, lastName, address, phoneNumber, pet);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public long getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public Pet getPet(){
        return super.getPet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
