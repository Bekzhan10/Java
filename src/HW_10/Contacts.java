package HW_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contacts {
    public HashMap<String,Integer> contacts = new HashMap<>();
    public Scanner scan = new Scanner(System.in);

    public Contacts() {
        main();
    }

    public void main() {
        boolean menu = true;
        while (menu){
            System.out.println("1.Add a contact");
            System.out.println("2.Get all contacts");
            System.out.println("3.Change a contact");
            System.out.println("4.Search a contact");
            System.out.println("5.Stop");

            int num = scan.nextInt();
            switch (num){
                case 1:
                    addContact();
                    break;
                case 2:
                    getAllContacts();
                    break;
                case 3:
                    changeContact();
                    break;
                case 4:
                    searchByName();
                    break;
                case 5:
                    menu = false;
                    break;
            }
        }
    }

    public void addContact() {
        System.out.println("Enter a name of a contact");
        String name = scan.next();
        System.out.println("Enter a phone number");
        int phoneNumber = scan.nextInt();
        contacts.put(name,phoneNumber);
        System.out.println("Contact has been added!");
    }

    public void getAllContacts() {
        if(!contacts.isEmpty()){
        for (Map.Entry<String,Integer> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }}
        else
            System.out.println("There is no any contacts");

    }

    public void changeContact() {
        System.out.println("Enter a name of a contact you want to change");
        String name = scan.next();
        if(contacts.containsKey(name)){
            System.out.println("Enter a new phone number");
            int phoneNumber = scan.nextInt();
            contacts.put(name,phoneNumber);
            System.out.println("Contact has been successfully changed!");
        }
        else {
            System.out.println("There is no such name in contacts");
        }
    }

    public void searchByName() {
        System.out.println("Enter a name of a contact");
        String name = scan.next();
        if(contacts.containsKey(name)){
            System.out.println(contacts.get(name));
        }
        else
            System.out.println("There is no such name");

    }
}
//  5. Напишите консольное приложение, представляющее простую телефонную книгу,
//        содержащую связки между именами и телефонными номерами. Подумайте тщательно,
//        какую структуру данных можно использовать для этого типа приложения. В главном
//        меню пользователь имеет возможность добавить новый контакт, просмотреть все контакты,
//        обновить информацию о конкретном контакте и выполнить поиск контактов по имени.
//        Подсказка: используйте Scanner, while(true), switch-case.