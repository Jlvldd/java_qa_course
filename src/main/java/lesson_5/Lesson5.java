package lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Lesson5 {

    public static void main(String[] args) {
        Person[] personsArr = new Person[5];
        personsArr[0] = new Person("Rutov Andrey Ivanovich", "Artist", "Art@cun.ru", "+79529834376", 5000000, 56);
        personsArr[1] = new Person("Ignatov Ignat Olegovich", "loyaaaaar", "lol@mail.ru", "+79000000000", 676869696, 45);
        personsArr[2] = new Person("Zigotov Egor Egorovich", "dancaaaaarrr", "zira@mail.ru", "88005553535", 5000, 20);
        personsArr[3] = new Person("Irchenko Larisa Aleksandrovna", "engineer", "laro4ka1212@mail.ru", "+79880195520", 50000, 30);
        personsArr[4] = new Person("Oksanovich Elizavetta Natalievna", "feminist", "jusiyaaa777@boom.ru", "+79880775520", 500800, 34);
        System.out.println(Arrays.toString(personsArr));

        Park park = new Park();
        park.addAttraction("Чертово колесо", "10:00 - 22:00", 250);
        park.addAttraction("Американские горки", "10:00 - 22:00", 300);
        park.addAttraction("Комната страха", "10:00 - 22:00", 200);

        park.showAttraction();
    }

    public static class Person {
        private String fio;
        private String position;
        private String email;
        private String phoneNumber;
        private int salary;
        //копеечный метод, если нужно узнать копейки, то разделить на 100 > 6000-> 600000 тысяч коп.
        private int age;

        public Person(String fio, String position, String email, String phoneNumber, int salary, int age) {
            this.fio = fio;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }

        public String getFio() {
            return fio;
        }

        public void setFio(String fio) {
            this.fio = fio;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "fio='" + fio + '\'' +
                    ", position='" + position + '\'' +
                    ", email='" + email + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", salary=" + salary +
                    ", age=" + age +
                    '}';
        }
    }


    public static class Park {


        public class Attraction {
            private String name;
            private String workHours;
            private double price;

            public Attraction(String name, String workHours, double price) {
                this.name = name;
                this.workHours = workHours;
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getWorkHours() {
                return workHours;
            }

            public void setWorkHours(String workHours) {
                this.workHours = workHours;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            @Override
            public String toString() {
                return "Attraction{" +
                        "name='" + name + '\'' +
                        ", workHours='" + workHours + '\'' +
                        ", price=" + price +
                        '}';
            }
        }

        private final List<Attraction> attractions;

        public Park() {
            this.attractions = new ArrayList<Attraction>();

        }

        public void addAttraction(String name, String workHours, double price) {
            Attraction attraction = new Attraction(name, workHours, price);
            attractions.add(attraction);
        }

        public void showAttraction() {
            if (attractions.isEmpty()) {
                System.out.println("Нет аттракционов");
            } else {
                for (Attraction attraction : attractions) {
                    System.out.println(attraction);
                }
            }
        }

    }

}