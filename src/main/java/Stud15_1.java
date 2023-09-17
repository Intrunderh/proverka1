public class Stud15_1 { // создание публичного класса
    private String firstName; // приватные поля класса Person, которые доступны только объектам данного класса
    private String lastName;

    public Stud15_1(String firstName, String lastName) { // конструктор, который, при создании объекта класса Персон принимает
        // принимается две стринговых переменных, Имя и Фамилия
        this.firstName = firstName;// собственно сами наши переменные, в которые мы присвоили "входящие" переменные
        this.lastName = lastName;//  public Person(String firstName, String lastName)
    }

    protected String getFirstName() {// геттер ддля переменной, через него мы можем "вытягивать" значение
        return firstName;
    }

    String getLastName() {// геттер ддля переменной, через него мы можем "вытягивать" значение
        return lastName;
    }

    public String getFullName() {  //в этом методе происходит конкатенация (объединение в одну строку) имени и фамилии
        // и возвращаем это все одной стринговой переменной
        return firstName + " " + lastName;
    }
}