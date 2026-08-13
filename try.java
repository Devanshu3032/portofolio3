class try1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6} ; 
        int max = 0 ; 
        int curr = 1 ; 
        for (int i = 0; i < arr.length -1 ; i++) {
            curr = arr[i] * arr[i +1 ] ; 
            max = Math.max(max, curr) ; 
            curr = 1 ; 
        }
        System.err.println(max);
    }
}