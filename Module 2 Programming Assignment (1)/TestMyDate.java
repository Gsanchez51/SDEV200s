package TESt;
public class TestMyDate {
    public static void main(String[] args) {
        // Create MyDate object using the no-arg constructor
        MyDate currentDate = new MyDate();
        System.out.println("Current Date: " + currentDate.getYear() + "-" +
                           currentDate.getMonth() + "-" + currentDate.getDay());

        // Create MyDate object using the constructor with elapsed time
        MyDate specificDate = new MyDate(34355555133101L);
        System.out.println("Specific Date: " + specificDate.getYear() + "-" +
                           specificDate.getMonth() + "-" + specificDate.getDay());
    }
}
