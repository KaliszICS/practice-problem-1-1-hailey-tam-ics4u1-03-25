public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum2D(int arr[][]){
		int sum = 0;
		for (int row = 0; row < arr.length; row++){
			for (int col = 0; col < arr[row].length; col++){
				sum += arr[row][col];
			}
		}
		return sum;
	}

	public static int sumRow(int arr[][], int row){
		int sum = 0;
		for (int col = 0; col < arr[row].length; col++){
			sum += arr[row][col];
		}
		return sum;
	}

	public static int sumColumn(int arr[][], int col){
		int sum = 0;
		for (int row = 0; row < arr.length; row++){
			sum += arr[row][col];
		}
		return sum;
	}
}
