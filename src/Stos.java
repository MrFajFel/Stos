import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stos {

    private ArrayList<Integer> elementy = new ArrayList<>();
    private int pojemnosc;

    public Stos(int pojemnosc){
        if (pojemnosc<0){
            throw new IllegalArgumentException("Pojemnosc nie moze byc ujemna");
        }
        this.pojemnosc = pojemnosc;
    }

    public void push(int liczba) throws StackFullExeotion {
        if (elementy.size() < pojemnosc){
            elementy.add(liczba);
        }
        else {
            throw new StackFullExeotion();
        }
    }

    public int pop(){
        if(!elementy.isEmpty()){
            return elementy.removeLast();
        }
        else{
         throw new EmptyStackException();
        }
    }

    public void clear(){
        elementy.clear();
    }

    public int top(){
        if(!elementy.isEmpty()){
            return elementy.getLast();
        }
        else {
            throw new EmptyStackException();
        }
    }

    public int size(){
        return elementy.size();
    }
}
