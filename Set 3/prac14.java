public class prac14 {
    public static void main(String[] args) {
        Date myDate = new Date(7, 22, 2024);

        System.out.print("Initial date: ");
        myDate.displayDate();

        myDate.setDay(25);
        myDate.setMonth(12);
        myDate.setYear(2024);

        System.out.print("Modified date: ");
        myDate.displayDate();
        System.out.println("Day: " + myDate.getDay());
        System.out.println("Month: " + myDate.getMonth());
        System.out.println("Year: " + myDate.getYear());
        System.out.println("23DCS086 Mir");
    }
}