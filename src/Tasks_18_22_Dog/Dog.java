package Tasks_18_22_Dog;

public class Dog {

    private final String name;

    Dog(String name){
        this.name = name;
    }

    public void voice(){
        String splitter;
        for (int i = 0; i < 3; i++){
            splitter = i < 2 ? " " : "\n";
            System.out.print(name + "!" + splitter);
        }
    }

}
