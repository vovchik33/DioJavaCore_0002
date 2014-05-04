package edu.dio.lesson2;

/**
 * Created by Vladimir V.Kravchenko on 04.05.2014.
 */
public enum Profession {
    STUDENT("Student", 0), ENGINEER("Engineer", 1), ARCHITECT("Architect", 2);

    String description;
    int status;

    Profession(String description, int status) {
        this.description = description;
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Profession{");
        sb.append("description='").append(description).append('\'');
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }


}
