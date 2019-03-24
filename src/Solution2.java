public class Solution2 {

    public static void main(String[] args) {
        Solution2 s=new Solution2();
         System.out.println(s.solution("Wed",2));  //Fri
        System.out.println(s.solution("Sat",23)); //Mon
        System.out.println(s.solution("Mon",7)); //Mon
    }

    public String solution(String S, int K) {
        // write your code in Java SE 8
        int n=0;
        String answer="";
        switch(  S){
            case "Mon": n=1;
                break;
            case "Tue": n=2;
                break;
            case "Wed": n=3;
                break;
            case "Thu": n=4;
                break;
            case "Fri": n=5;
                break;
            case "Sat": n=6;
                break;
            case "Sun": n=7;
                break;
        }
        int wibrMesiac=0;
        if(K>7){
            wibrMesiac=K%7;
        }else {
            wibrMesiac=K;
        }


        wibrMesiac=wibrMesiac+n;
        if(wibrMesiac>7) {
            wibrMesiac = wibrMesiac % 7;
        }

        System.out.print(wibrMesiac+ "  ");

        switch(wibrMesiac){
            case 1: answer="Mon";
            break;
            case 2: answer="Tue";
                break;
            case 3: answer="Wed";
                break;
            case 4: answer="Thu";
                break;
            case 5: answer="Fri";
                break;
            case 6: answer="Sat";
                break;
            case 7: answer="Sun";
                break;
        }
        return answer;
    }
}
