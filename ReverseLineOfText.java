public class ReverseLineOfText {
    public static void main(String[] args) {
        String str = "   I love Java Programming";
        String res = str.trim();
        String arr[] = res.split(" ");
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String ans = String.join(" ",arr);
        System.out.print(ans);
    }
}
