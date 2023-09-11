import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static TodoFunction myTodoList = new TodoFunction();

    public static void printCommand(){
        System.out.println("\n Commands: " +
                "\n Press 0 : To print instructions" +
                "\n Press 1 : To print list" +
                "\n Press 2 : To print in Todo"+
                "\n Press 3 : To modify item in todo"+
                "\n Press 4 : To remove item from todo"+
                "\n Press 5 : To search an item from Todo"+
                "\n Press 6 : To exit the app");
    }

    public static void addItem(){
        System.out.println("Enter item to be added in the list : ");
        myTodoList.addItem(sc.nextLine());
    }

    public static void updateItem(){
        System.out.println("Enter the item no. : ");
        int index = sc.nextInt();
        sc.nextLine();
        System.out.println("enter new item to be added : ");
        String myNewItem = sc.nextLine();
        myTodoList.updateList(index-1, myNewItem);
    }

    public static void removeItem(){
        System.out.println("Enter the item no. to be deleted : ");
        int index = sc.nextInt();
        sc.nextLine();
        myTodoList.removeItem(index);
    }

    public static void searchItem(){
        System.out.println("Enter item to be searched : ");
        String searchItem = sc.nextLine();

        if(myTodoList.findItem(searchItem)==null){
            System.out.println("Item not found in TODO list");
        }
        else{
            System.out.println(searchItem + " was found in the list");
        }
    }

    public static void main(String[] args) {
        int command = 0;
        boolean exit = false;
        printCommand();

        while(!exit){
            System.out.println("Enter your command here :");
            command = sc.nextInt();
            sc.nextLine();

            switch(command){
                case 0:
                    printCommand();
                    break;

                case 1:
                    myTodoList.printTodoList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit=true;
                    break;

                default:
                    System.out.println("Please pick only from the given command.");

            }

        }

    }
}