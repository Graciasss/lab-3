public class Algorythm {
    private int low;
    private int high;
    private int array[];
    private int count;
	
	public Algorythm(int count, int low, int high){
        this.count = count;
        this.low = low;
        this.high = high; 
    }

    public void start() {
		array=new int[count];
        fillarry();
    }
    private void fillarry(){
        for (int i = 0; i < this.count; ++i){
            array[i] = 1;
        }
    }
    public int[] getArray() {
        return this.array;
    }
}
