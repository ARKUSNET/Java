package ru.webapp.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Created by a.kuspakov on 08.09.2016.
 */
public class Resume implements Comparable<Resume>{
    private String uuid;
    private String fullName;
    private String location;
    private String homePage;
    private List<Contact> contacts = new LinkedList<>();
    private List<Section> sections = new LinkedList<>();

    public Resume(String fullName, String location){
        this(UUID.randomUUID().toString(), fullName, location);
    }

    public Resume(String uuid, String fullName, String location) {
        this.uuid = uuid;
        this.fullName = fullName;
        this.location = location;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, fullName, location, homePage, contacts, sections);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Resume other = (Resume) obj;
        return Objects.equals(this.uuid, other.uuid)
                && Objects.equals(this.fullName, other.fullName)
                && Objects.equals(this.location, other.location)
                && Objects.equals(this.homePage, other.homePage)
                && Objects.equals(this.contacts, other.contacts)
                && Objects.equals(this.sections, other.sections);
    }

    public void addSection(Section section){
        sections.add(section);
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getUuid() {
        return uuid;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLocation() {
        return location;
    }

    public String getHomePage() {
        return homePage;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public List<Section> getSections() {
        return sections;
    }

    @Override
    public int compareTo(Resume o) {
        return fullName.compareTo(o.fullName);
    }
}
