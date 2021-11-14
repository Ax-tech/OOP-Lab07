package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

	private final List<T> list;
	
	public OneListAcceptable(java.util.List<T> l){
		this.list = l;
	}
	
	@Override
	public Acceptor<T> acceptor() {
		final Iterator<T> iterator = list.iterator();
        return new Acceptor<T>() {

            /**
             * @param newElement
             *            the new element to be accepted
             */
            @Override
            public void accept(final T newElement) throws Acceptor.ElementNotAcceptedException {
                try {
                    if (newElement.equals(iterator.next())) {
                        return;
                    }
                } catch (Exception e) {
                    System.out.println("There are no more element to be evaluated");
                }
                throw new Acceptor.ElementNotAcceptedException(newElement);
            }

            @Override
            public void end() throws Acceptor.EndNotAcceptedException {
                try {
                    if (!iterator.hasNext()) {
                        return;
                    }
                } catch (Exception e) {
                    System.out.println("2" + e.getMessage());
                }
                throw new Acceptor.EndNotAcceptedException();
            }
        };
    }
}
