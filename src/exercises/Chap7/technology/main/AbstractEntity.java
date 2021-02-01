package exercises.Chap7.technology.main;

public abstract class AbstractEntity {

    //Variable
    private int id;
    private static int nextId = 1;

    //Constructor
    public AbstractEntity() {
        this.id = nextId;
        nextId ++;
    }

    //Get-set

    public int getId() {
        return id;
    }
}
