

import Q1.ChoiceQuestion;

public class AnyCorrectChoiceQuestion extends ChoiceQuestion
{
	
	public AnyCorrectChoiceQuestion()
	{
		super();
	}
	
	
	public void setAnswer(String answer)
	{
		String newAnswers = getAnswer();
		
		newAnswers += answer + " ";
		super.setAnswer(newAnswers);
	}
	
	
	public void addChoice(String choice, boolean correct)
	{
		super.setChoice(choice);
		
		if(correct)
		{
			setAnswer(choice);
		}
	}
	
	public boolean checkAnswer(String response)
	{
		return this.getAnswer().trim().toLowerCase().contains(response.trim().toLowerCase());
	}
	
	
	public void display()
	{
		super.display();
		System.out.println("Provide any correct answers in the order listed\nIf there are more than one, provide them each separated by spaces");
	}
}
