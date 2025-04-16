public class MaxWealth {
    public static void main(String[] args){

    }
    public int maximumWealth(int[][] accounts) {
        int[] individualWealth=new int[accounts.length];
        int len=-1;
        for(int[] y:accounts){
            int wealth=0;
            len++;
            for(int z=0;z<y.length;z++){
                wealth=wealth+y[z];
            }
            individualWealth[len]=wealth;
        }
        //find the highest amount
        int highProfile=0;
        for(int amount:individualWealth){
            if(amount>highProfile){
                highProfile=amount;
            }
        }
        return highProfile;
    }
}
