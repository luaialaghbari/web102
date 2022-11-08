

import java.util.Scanner;


public class Question
{
	
	private String text;
	private String answer;
	
	
	public Question()
	{
		text = "";
		answer = "";
	}
	
	
	public Question(String questionText)
	{
		this.text = questionText;
		this.answer = "";
	}
	
	
	public void setAnswer(String correctResponse)
	{
		this.answer = correctResponse;
	}
	
	
	public String getAnswer()
	{
		return this.answer;
	}
	
	
	public void setText(String questionText)
	{
		this.text = questionText;
	}
	
	
	public void appendAnswer(String answerText)
	{
		this.answer = this.answer.concat(" ".concat(answerText));
	}
	
	
	public String getText()
	{
		return this.text;
	}
	
	
	public boolean checkAnswer(String response)
	{
		return response.equalsIgnoreCase(answer);
	}
	
	
	public void display()
	{
		System.out.println(text);
	}
	
	
	public void presentQuestion()
	{
		Scanner in = new Scanner(System.in);
		
		this.display();
		
		System.out.print("Your Answer: ");
		String response = in.nextLine();
		
		System.out.println(this.checkAnswer(response));
	}
	
	
	public String toString()
	{
		return getClass().getName();
	}
}
