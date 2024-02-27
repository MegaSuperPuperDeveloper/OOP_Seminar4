package controllers;

public class AccountController<T, V> {
    public void paySalary(T Person, V salary) {
        System.out.println(Person.getName());
    }
}
