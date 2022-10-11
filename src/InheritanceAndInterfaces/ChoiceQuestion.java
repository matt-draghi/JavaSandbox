package InheritanceAndInterfaces;

import java.util.ArrayList;


//ChoiceQuestion is a subclass       Question is a superclass

/**
 * A question with multiple choices.
 */
public class ChoiceQuestion extends Question{ //the extends keyword denotes inheritance
    //This instance variable is added to the subclass
    private ArrayList<String> choices;
    //A subclass has no access to private instance variables of the superclass

    /**
     * Constructs a choice question with no choice
     */
    public ChoiceQuestion(){
        choices = new ArrayList<String>();
    }

    //This method us added to the subclass

    /**
     * Adds an answer choice to this question.
     * @param choice the choice to add
     * @param correct true if this is the correct choice, false otherwise
     */
    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if(correct){
            //Convert choices.size() to string
            String choiceString = "" + choices.size();
            this.setAnswer(choiceString);
        }
    }

    //This method overrides a method from the superclass
    @Override  //Annotates a method that overrides a superclass method
    public void display(){
        //Display the question text; Because you can't call the instance variable, you can call the method itself
        super.display(); //Need to specify this is the display from the superclass
        //Display the answer choices
        for(int i = 0; i < choices.size(); i++){
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }
}
