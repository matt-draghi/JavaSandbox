import java.util.ArrayList;

public class Arrays {

    public static void Arrays(){
        //declare
        double[] values = new double[10]; //by default, all values when initialized like this are 0
        double[] moreValues = { 32, 23, 67, 23.4, 68, 29, 115, 44.5, 100, 65};

        System.out.println(moreValues[3]);

        //Strings use .length()
        String testString = "test";
        int stringLength = testString.length();

        //Arrays use .length
        int arrayLength = moreValues.length;

        //Two-dimensional Arrays (Matrix)
        final int COUNTRIES = 7;
        final int MEDALS = 3;

        int[][] counts = new int[COUNTRIES][MEDALS];

    }

    public static void ArrayLists() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Harry");

        names.add("Emily");
        names.add("Bob");
        names.add("Cindy");

        int arrayListLength = names.size();

        String name = names.get(2);

        int i = names.size()-1;
        name = names.get(i);

        names.set(2, "Carolyn");

        System.out.println(names);
        names.remove(1);

        for(String arrayListElement : names){
            System.out.println(arrayListElement);
        }

        ArrayList<String> highschoolFriends = names;
        //this just creates a new reference for names; editing this edits names

        ArrayList<String> collegeFriends = new ArrayList<>(names);
        //rather than creating another reference of the same arraylist, this creates a new array with the data from names

        //Different wrappers are needed for primitive data types when using array lists
        ArrayList<Integer> integerArrayList = new ArrayList<>(); //Integer, not int
        ArrayList<Character> characterArrayList = new ArrayList<>(); //Character, not char
        ArrayList<Double> doubleArrayList = new ArrayList<>(); //Double, not double (this goes for boolean as well - you use Boolean)
    }

}
