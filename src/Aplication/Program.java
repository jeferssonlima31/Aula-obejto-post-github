package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		
		Comment c1 = new Comment("have a nice trip! ");
		Comment c2 = new Comment("wow that's awesome! ");
		Post p1 = new Post(sdf.parse("21/06/2021 13:05:44")
				,"Travelling to US"
				, "I'm gonto to to visit", 12);
		 
		p1.addComment(c1);
		p1.addComment(c2);
		 
		
		Comment c3 = new Comment("good night ");
		Comment c4 = new Comment("may the force be with you ");
		Post p2 = new Post(sdf.parse("02/08/2021 13:05:44")
				,"Good night guys"
				, "see you temorrow", 5);
		 
		p2.addComment(c3);
		p2.addComment(c4);
		 
		System.out.println(p1);
		System.out.println(p2);
		
		
		
		sc.close();

	}

}
