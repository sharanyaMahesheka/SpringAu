package Generics;

public class GenericArrayList<E> {

	private Object[] Array;
	public static final int DEFAULT_SIZE = 20;
	private int size = 0;

	public GenericArrayList() {
		this(DEFAULT_SIZE);
	}

	public GenericArrayList(int size) {
		Array = new Object[size];
	}

	public void add(E element) {
		checkSize();
		Array[size++] = element;
	}

	public void checkSize() {
		if (size < Array.length) {
			return;
		}
		reSize();
	}

	public void reSize() {
		Object[] temp = new Object[Array.length * 2];
		copy(Array, temp);
		Array = temp;
	}

	public void copy(Object[] dest, Object[] src) {
		if (!(dest.length < src.length)) {
			for (int i = 0; i < src.length; i++) {
				dest[i] = src[i];
			}
		}
	}

	private void compress() {
		int skipCount = 0;
		for (int i = 0; i < size && i < Array.length; i++) {
			if (Array[i] == null) {
				++skipCount;
			}
			Array[i] = Array[i + skipCount];
		}
	}

	public E remove(int index) {
		if (index >= size || index < 0) {
			throw new RuntimeException("Invalid index");
		}
		E element = (E) Array[index];
		Array[index] = null;
		--size;

		return element;
	}

	public E get(int index) {
		 if(index>=size || index < 0 ){throw new RuntimeException("Invalid index");}
		    E element = (E) Array[index];
		    Array[index] = null;
		    --size;
		    compress();
		    return element;
	}
	
	public static void main(String args[]) {
		GenericArrayList<String> A =  new GenericArrayList<String>();
		A.add("Accolite");
		A.add("Banglore");
		
		A.remove(1);
		System.out.println(A.get(0));
	}
}
