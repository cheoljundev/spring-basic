package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setAge(10);
        helloLombok.setName("asd");

        String name1 = helloLombok.getName();
        int age1 = helloLombok.getAge();
        System.out.println("name1 = " + name1);
        System.out.println("age1 = " + age1);
        System.out.println("helloLombok = " + helloLombok);
    }
}
