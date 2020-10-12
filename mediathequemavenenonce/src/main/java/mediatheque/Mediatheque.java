package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {

    private List<Item> items = new LinkedList<Item>();

    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();

        mediatheque.addItem(new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem(new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem(new CD(12, "Sergeant Peppers"));
        mediatheque.printCatalog();
        mediatheque.printOnlyBooks();
        mediatheque.printOnlyCDs();		
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public void printCatalog() {
        accept(new ItemPrinter());
    }

    public void printOnlyBooks() {
        accept(
                new ItemPrinter() {
            @Override
            public void visit(CD cd) {
            }
        }
        );
    }

    public void printOnlyCDs() {
        accept(
            new ItemPrinter() {
                @Override
                public void visit(Book b) {}
        }
        );
    }

    public void accept(ItemVisitor iv) {
        items.forEach((i) -> {
            i.accept(iv);
        });
    }
}
