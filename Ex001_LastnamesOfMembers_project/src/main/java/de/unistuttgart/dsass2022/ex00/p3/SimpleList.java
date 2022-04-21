package de.unistuttgart.dsass2022.ex00.p3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class SimpleList<T extends Comparable<T>> implements ISimpleListIterable<T> {



	private class SimpleListIterator implements Iterator{
		private int startIndex = 0;

		public SimpleListIterator(){

		}

		@Override
		public boolean hasNext(){
			return startIndex < list.size();
		}
		@Override
		public T next(){
			if(!hasNext()){
				throw new NoSuchElementException();
			}
			int nextElement =startIndex;
			startIndex ++;
			return list.get(nextElement++);
		}
		@Override
		public void remove(){
			throw new UnsupportedOperationException();
		}

	}

	private class SkippingIterator implements Iterator{
		private int numberSkippedElements;
		private int startIndex = 0;

		public SkippingIterator(int numberSkippedElements){
			this.numberSkippedElements = numberSkippedElements;
		}
		@Override
		public boolean hasNext(){
			return startIndex<list.size();
		}
		@Override
		public T next(){
			if(startIndex == 0){
				startIndex++;
				return list.get(0);
			}

			int nextElement = startIndex+numberSkippedElements-1;
			if(nextElement > list.size()){
				throw new NoSuchElementException();
			}
			return list.get(nextElement);
		}
		@Override
		public void remove(){
			throw new UnsupportedOperationException();
		}

	}
	@Override
	public Iterator<T> iterator(){
		return new SimpleListIterator();
	}

	@Override
	public Iterator<T> skippingIterator(int numberSkippedElements) {
		if (numberSkippedElements<1)
			throw new IllegalArgumentException();
		return new SkippingIterator(numberSkippedElements);
	}


	/** Do not modify the existing methods and signatures */
	private final List<T> list;

	public SimpleList() {
		list = new ArrayList<T>();
	}

	@Override
	public void append(T element) {
		list.add(element);
	}

	@Override
	public int getSize() {
		return list.size();
	}

	@Override
	public T getElement(int index) {
		return list.get(index);
	}


}
