package ru.webapp.model;

/**
 * Created by Айслу on 11.09.2016.
 */
public enum SectionType {
    OBJECTIVE("Позиция"),
    ACHIEVEMENT("Достижения"),
    QUALIFIVATION("Квалификация"),
    EXPERIENCE("Опыт работы"),
    EDUCATION("Образование");

    private String title;

    SectionType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
