package abstractclass;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AbstractClassTheater theater = new AbstractClassTheater();
        theater.bookTicket(87);
        System.out.print("\n");
        System.out.print(theater.getDirection());
    }
}