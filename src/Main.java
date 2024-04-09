public class Main {
    public static void main(String[] args) throws StackFullExeotion {
        Stos stos1 = new Stos(12);
        try {
            stos1.push(2);
            stos1.push(6);
            stos1.push(12);
        }catch (StackFullExeotion e){
            e.getMessage();
        }


        System.out.println(stos1.pop());
        System.out.println(stos1.top());
        System.out.println(stos1.size());
        System.out.println(stos1);
        stos1.clear();

    }
}