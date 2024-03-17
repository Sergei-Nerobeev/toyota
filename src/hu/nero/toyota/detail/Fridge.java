package hu.nero.toyota.detail;

public class Fridge {
    private String title;

    public void freeze() {
        System.out.println("Cool cold cola in " + title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
