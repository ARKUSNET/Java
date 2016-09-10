package ru.webapp.model;

/**
 * Created by Айслу on 08.09.2016.
 */
public class Link {
    public static Link EMPTY = new Link();
    private final String name;
    private final String url;

    public Link() {
        this("", null);
    }

    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Link(Link link) {
        this(link.name, link.url);
    }

    public void out() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    public static Link empty() {
        return EMPTY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Link link = (Link) o;

        if (!name.equals(link.name)) return false;
        if (url != null ? !url.equals(link.url) : link.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    @Override
    public
    String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
