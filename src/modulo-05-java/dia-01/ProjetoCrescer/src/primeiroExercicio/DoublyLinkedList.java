package primeiroExercicio;

import java.util.List;

import primeiroExercicioException.EmptyListException;

public class DoublyLinkedList<T> implements ListAction<T> {

    protected Node<T> last, first;

	@Override
	public void addFirst(T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getFirst() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public T getLast() throws EmptyListException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<T> list() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void addLast(T value) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void add(int index, T value) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void add(T value) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}
	
	protected class Node<U> {

        private U value;

        private Node<U> next, previous;

        public Node(U value, Node<U> next, Node<U> previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

        public Node(U value) {
            this.value = value;
        }
        
        public Node<U> getPrevious() {
			return previous;
		}
        
        public void setPrevious(Node<U> previous) {
			this.previous = previous;
		}

        public void setNext(Node<U> next) {
            this.next = next;
        }

        public Node<U> getNext() {
            return this.next;
        }

        public U getValue() {
            return this.value;
        }

        public void setValue(U value) {
            this.value = value;
        }
    }
}
