public class Zadanie2 {
    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(55);
        tree.add(6);
        tree.add(7);
        tree.add(8);

        tree.add(2);

        System.out.println("Maksymalna wartość to: " + tree.maksimum());
        System.out.println("Minimalna wartość to: " + tree.minimum());
        System.out.println("Czy drzewo zawiera szukaną wartość: " + tree.zawiera(3));
    }
}