public class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("The " + color  + " cat with name "
                + name + ", who " + age + " years old" +  ", made sound meow");
    }
}
