/**
 * Created by 47989768s on 14/02/17.
 */
public class Persona {

    public String name;
    public String lastName;
    public int age;

    public Persona(String _name, String _lastName, int _age){

        name = _name;
        lastName = _lastName;
        age = _age;

    }

    public Persona() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
