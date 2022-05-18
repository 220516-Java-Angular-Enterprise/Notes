public class Dog {
    enum Breed {};
    private int age;
    char gender;

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", gender=" + gender +
                '}';
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
