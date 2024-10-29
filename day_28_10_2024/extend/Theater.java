package extend;
class Theater {
    private String name;
    private String location;

    public Theater(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void showEvent() {
        System.out.println(name + " is hosting an event.");
    }
}

class MovieTheater extends Theater {
    private int numberOfScreens;

    public MovieTheater(String name, String location, int numberOfScreens) {
        super(name, location);
        this.numberOfScreens = numberOfScreens;
    }

    public int getNumberOfScreens() {
        return numberOfScreens;
    }

    @Override
    public void showEvent() {
        System.out.println(getName() + " is showing movies on " + numberOfScreens + " screens.");
    }
}

class Auditorium<T extends Theater> {
    private final T theater;

    public Auditorium(T theater) {
        this.theater = theater;
    }

    public T getTheater() {
        return theater;
    }

    public void hostEvent() {
        System.out.println("Hosting an event at " + theater.getName() + " located at " + theater.getLocation() + ".");
        theater.showEvent();
    }
}


