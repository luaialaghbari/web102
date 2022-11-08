

public class MultipleChoiceQuestionTester
{
	public static void main(String[] args)
	{
		MultipleChoiceQuestion q = new MultipleChoiceQuestion();
		
		q.setText("Which of these countries are in Asia");
		
		q.addChoice("yemen", true);
		q.addChoice("France", false);
		q.addChoice("Saudi Arabia", true);
		q.addChoice("Germany", false);
		q.addChoice("China", true);
		
		q.presentQuestion();
	}
}
