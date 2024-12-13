/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        int [] arr = {5, 3, 2, 8, 6, 7, 1, 3};
        
        int dupeCheck = 8;
        
        for (int i = 0; i < arr.length; i++) {
            if (dupeCheck == arr[i]) {
                System.out.println("Duplicate Found at index " + i);
            }
        }
        
        
	}
}