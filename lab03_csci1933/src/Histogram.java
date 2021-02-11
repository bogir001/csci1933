public class Histogram{
    public int lower;
    public int upper;
    public int[] class_members;
    public Histogram(int lowerbound, int upperbound){
        lower = lowerbound;
        upper = upperbound;
        class_members = new int[upperbound-lowerbound + 1];
    }
    public boolean add(int i){
        if (i >= lower && i <= upper){
            class_members[i - lower] ++;
            return true;
        }
        else {
            return false;
        }
    }

    public String toString(){
        String output = " ";
        for (int i=lower; i <= upper; i++)
        {
            output = output + i + ':';
            for (int j=0; j < class_members[i - lower]; j++){
                output += '*';
            }
            output += '\n';
        }
        return output;
    }

    public static void main(String args[]) {
        Histogram histo = new Histogram(5, 10);
        histo.add(8);
        histo.add(6);
        histo.add(10);
        histo.add(9);
        histo.add(8);
        histo.add(6);
        histo.add(8);
        histo.add(7);
        histo.add(9);
        System.out.println(histo);
    }


}