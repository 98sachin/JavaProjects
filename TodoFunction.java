import java.util.ArrayList;

public class TodoFunction {

        private ArrayList<String> todoList = new ArrayList<String>();

//        Add items to list

    public void addItem(String item){
        todoList.add(item);
    }

//    Remove items from list

    public void removeItem(int index){
        String myItem = todoList.get(index);
        todoList.remove(index-1);
    }


//    Print the entire list

    public void printTodoList(){
        System.out.println("TodoList consists of "+ todoList.size()+" items");
        for(int i=0; i<todoList.size(); i++){
            System.out.println("Item at position : "+(i+1)+" is "+ todoList.get(i));
        }
    }

//        Update the List

    public void updateList(int index, String list){
        todoList.set(index, list);
        System.out.println("Update is completed at index : "+(index+1));
    }

//    Search feature for user

    public String findItem(String searchItem){
        int index = todoList.indexOf(searchItem);

        if(index==-1){
            return null;
        }
        else{
            return todoList.get(index);
        }
    }


}
