package nestedclass;

public class Theater {
    private String theaterName;

    public Theater(String name) {
        this.theaterName = name;
    }

    // Static Nested Class
    public static class Screen {
        private int screenNumber;
        public Screen(int screenNumber) {
            this.screenNumber = screenNumber;
        }
        public void showScreenInfo() {
            System.out.println("Screen number: " + screenNumber);
        }
    }

    // Inner Class
    public class Seat {
        private int seatNumber;
        private boolean isReserved;
        public Seat(int seatNumber) {
            this.seatNumber = seatNumber;
            this.isReserved = false;
        }
        public void reserve() {
            if (!isReserved) {
                isReserved = true;
                System.out.println("Seat " + seatNumber + " reserved at " + theaterName);
            } else {
                System.out.println("Seat " + seatNumber + " is already reserved.");
            }
        }
    }

    // Method with a Local Inner Class
    public void displayShowTiming() {
        class Show {
            private String time;
            public Show(String time) {
                this.time = time;
            }
            public void showTimingInfo() {
                System.out.println("Show time at " + theaterName + ": " + time);
            }
        }

        Show show = new Show("6:00 PM");
        show.showTimingInfo();
    }


    public static void main(String[] args) {
        Theater theater = new Theater("Grand Cinema");
        Screen screen = new Screen(1);
        screen.showScreenInfo();
        Seat seat = theater.new Seat(10);
        seat.reserve();
        theater.displayShowTiming();

    }
}

