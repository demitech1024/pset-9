import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}
		
		if (a.get(0) == b.get(0) || a.get(a.size() - 1) == b.get(b.size() - 1)) {
			return true;
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		if (values == null || values.size() < n || n <= 0) {
			return new ArrayList<String>();
		}

		ArrayList<String> returnMe = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			returnMe.add(i, values.get(i));
		}

		int index = n;
		for (int i = values.size() - n;  i < values.size(); i++) {
			returnMe.add(index, values.get(i));
			index++;
		}
		
		return returnMe;	// default return value to ensure compilation
	}
	
	public int difference(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 1) {
			return -1;
		}

		int max = 0;
		int min = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (i == 0) {
				min = numbers.get(i);
				max = numbers.get(i);
			}

			if (max < numbers.get(i)) {
				max = numbers.get(i);
			}

			if (min > numbers.get(i)) {
				min = numbers.get(i);
			}
		}
		
		return max - min;		// default return value to ensure compilation
	}
	
	public double biggest(ArrayList<Double> numbers) {
		if (numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0) {
			return -1;
		}

		int midIndex = (int)(Math.ceil(numbers.size() / 2));
		double max = -1;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < 0) {
				return -1;
			}

			if ((i == 0 || i == numbers.size() - 1|| i == midIndex) && numbers.get(i) > max) {
				max = numbers.get(i);
			}
		}
		
		return max;		// default return value to ensure compilation
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		if (values == null || values.size() < 3 || values.size() % 2 == 0) {
			return new ArrayList<String>();
		}

		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) == null) {
				return new ArrayList<String>();
			}
		}

		int midIndex = (int)(Math.ceil(values.size() / 2));
		ArrayList<String> returnMe = new ArrayList<String>();
		returnMe.add(values.get(midIndex - 1));
		returnMe.add(values.get(midIndex));
		returnMe.add(values.get(midIndex + 1));

		return returnMe;
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		int counter = 0;
		int currentNum = -1;
		for (int i = 0; i < numbers.size(); i++) {
			if (i == 0) {
				counter = 1;
				currentNum = numbers.get(i);
			}

			if (numbers.get(i) == currentNum + 1) {
				counter++;
				currentNum = numbers.get(i);
			} else {
				counter = 1;
				currentNum = numbers.get(i);
			}

			if (counter == 3) {
				return true;
			}
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		if (numbers == null || numbers.size() < 1) {
			return false;
		}

		boolean lastPos = false;
		int gap = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) == x) {
				lastPos = true;
				gap = 0;
			} else {
				if (i == 1 && lastPos == false) {
					return false;
				} else if (lastPos == false) {
					gap++;
				}
				lastPos = false;
			}

			if (gap == 2) {
				return false;
			}
		}

		return true;	// default return value to ensure compilation
	}
	
	public boolean consecutive(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		int remainder = -1;
		int prevRemainder = -1;
		int inARow = 0;
		for (int i = 0; i < numbers.size(); i++) {
			remainder = numbers.get(i) % 2;
			if (remainder == 1) {
				if (prevRemainder == 1) {
					inARow++;
				} else {
					inARow = 1;
				}
			} else {
				if (prevRemainder == 0) {
					inARow++;
				} else {
					inARow = 1
				}
			}

			if (inARow == 3) {
				return true;
			}

			prevRemainder = remainder;
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(ArrayList<String> values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
