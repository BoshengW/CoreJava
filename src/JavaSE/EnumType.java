package JavaSE;
public class EnumType {
    Day day;

    public EnumType(Day day) {
        this.day = day;
    }
    public static void main(String[] args) {
        EnumType exp = new EnumType(Day.MONDAY);
        System.out.println(Day.TUESDAY); // 直接调用Day Enum里面的值
    }
}

