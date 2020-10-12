/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

/**
 *
 * @author ucabanes
 */
public class ItemPrinter implements ItemVisitor{
    
    @Override
    public void visit(Book b) {
        System.out.println(b);
    }

    @Override
    public void visit(CD cd) {
        System.out.println(cd);
    }
}
