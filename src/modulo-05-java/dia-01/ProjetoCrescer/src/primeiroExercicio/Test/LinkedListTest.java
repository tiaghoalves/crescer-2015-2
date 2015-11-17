package primeiroExercicio.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import primeiroExercicio.LinkedList;


public class LinkedListTest {

    @Test
    public void adicionarPrimeiroNaLista() {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("primeiro");
        linkedList.addFirst("segundo");
        linkedList.addFirst("terceiro");

        assertEquals(linkedList.getFirst(), "terceiro");
        assertEquals(linkedList.getLast(), "primeiro");
    }

    @Test
    public void mostrarTodosNaLista() {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("primeiro");
        linkedList.addFirst("segundo");
        linkedList.addFirst("terceiro");
        assertEquals(linkedList.list().size(), 3);
    }

    @Test
    public void removePrimeiroDaLista() {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("primeiro");
        linkedList.addFirst("segundo");
        linkedList.addFirst("terceiro");

        linkedList.removeFirst();

        assertEquals(linkedList.getFirst(), "terceiro");
    }

    @Test
    public void removeUltimoDaListaPorIndice() {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("primeiro");
        linkedList.addFirst("segundo");
        linkedList.addFirst("terceiro");

        linkedList.remove(2);
        
        assertEquals(linkedList.getFirst(), "terceiro");
        assertEquals(linkedList.getLast(), "primeiro");
        assertEquals(linkedList.list().size(), 3);
    }

}
