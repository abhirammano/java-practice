public class FizzBuzz {
    public static void main(String[] args){

    }
    public List<String> process(int n) {
        List<String>out=new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                out.add("FizzBuzz");
            }
            else if(i%3==0){
                out.add("Fizz");
            }
            else if(i%5==0){
                out.add("Buzz");
            }
            else{
                out.add(String.valueOf(i));
            }
        }
        return out;
    }
}
