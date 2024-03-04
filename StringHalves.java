import java.util.HashMap;

public class StringHalves {
    public static boolean halvesAreAlike(String s){
        String a = s.substring(0, s.length()/2).toLowerCase();
        String b = s.substring(s.length()/2).toLowerCase();

        int counter = 0;

        for (int i=0; i<a.length(); i++){
            char ch = a.charAt(i);

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                counter++;
            }
        }

        for (int j=0; j<b.length(); j++){
            char ch = b.charAt(j);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                counter--;
            }
        }

        return counter==0 ? true:false;
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("AbCdEfGh"));
    }
}
