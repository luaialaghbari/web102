

public class MultipleChoiceQuestion extends ChoiceQuestion
{
	public MultipleChoiceQuestion()
	{
		super();
		
		
	}
	
	public void setAnswer(String answer)
	{
		String newAnswer = getAnswer();
		
		newAnswer += answer + " ";
		super.setAnswer(newAnswer);
	}
	
	
	public void addChoice(String choice, boolean correct)
	{
		super.setChoice(choice);
		
		if(correct)
		{
			setAnswer(choice);
		}
	}
	
	
	public void display()
	{
		super.display();
		System.out.println("Provide all correct answers\nIf there are more than one, provide them each separated by spaces");
	}
	
	
	public boolean checkAnswer(String response)
	{
		return this.getAnswer().trim().toLowerCase().equals(response.trim().toLowerCase());
	}
}
