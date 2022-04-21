package de.unistuttgart.dsass2022.ex01.p5;

public class Sorter {

	/**
	 * Performs selection sort on provided list, works directly on list object,
	 * hence no return value
	 * 
	 * @param <T>  The type of list element
	 * @param list List to apply the sorting to; unsorted list at first, sorted list
	 *             in the end
	 */
	public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {
		if(liste != null && list.size() >=2){
			for(int i = 0; i< list.size(); i++)
				int maxElement = i;
				for(int j=i; j< list.size()-i; j++){
					if(list.get(maxElement)<list.get(j)
				}
		}
		
	}

	/**
	 * Performs insertion sort on provided list, works directly on list object,
	 * hence no return value
	 * 
	 * @param <T>  The type of list element
	 * @param list List to apply the sorting to; unsorted list at first, sorted list
	 *             in the end
	 */
	public static <T extends Comparable<T>> void insertionSort(ISimpleList<T> list) {
		
	}

	/**
	 * Performs bubble sort on provided list, works directly on list object, hence
	 * no return value
	 * 
	 * @param <T>  The type of list element
	 * @param list List to apply the sorting to; unsorted list at first, sorted list
	 *             in the end
	 */
	public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {
		
	}
}
