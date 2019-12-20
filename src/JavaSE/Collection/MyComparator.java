package JavaSE.Collection;
import java.util.*;

public class MyComparator {



    // Sort by your defined rule, you can use comparable
    static class Car implements Comparable<Car> {
        private int age;
        private int price;

        public Car(int price) {
            this.price = price;
        }

        public Car(int price, int age) {
            this.price = price;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "price=" + price +
                    ", age=" + age +
                    '}';
        }

        @Override
        public int compareTo(Car car) {
            // during sorting, they will use compareTo to compare each element
            return this.price - car.price;
        }
    }

    // unlike comparable, comparator is external to the element type we are comparing
    // it's a separate class. -> you can create multiple seperate classes to compare by different members
    // if you want to make multiple comparator, then comparator is much better than comparable.
    static class RatingAge implements Comparator<Car> {

        @Override
        public int compare(Car car1, Car car2) {
            return car1.age-car2.age;
        }
    }

    public static void main(String[] args) {

        // use comparable
        ArrayList<Car> array2 = new ArrayList<Car>();
        array2.add(new Car(4000,10));
        array2.add(new Car(2000, 5));
        array2.add(new Car(3000, 20));
        array2.add(new Car(1000, 0));
        Collections.sort(array2);
        System.out.println(array2);


        // use comparator
        RatingAge rateComp = new RatingAge();
        ArrayList<Car> array = new ArrayList<Car>();
        array.add(new Car(4000,10));
        array.add(new Car(2000, 5));
        array.add(new Car(3000, 20));
        array.add(new Car(1000, 0));
        // you can override toString() to print info you want
        Collections.sort(array, rateComp);
        System.out.println(array);
    }

}
