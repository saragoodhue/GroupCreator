import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectRunner
	{
		// Array list
		public static ArrayList<Student> StudentList = new ArrayList<Student>();
		
		
		public static void main(String[] args) throws IOException
			{
				fillArrayList();			

			}
		
		public static void fillArrayList() throws IOException
			{
				// filling array list
				Scanner myFile = new Scanner(new File("StudentList.txt"));
				int numberOfLines = myFile.nextInt();
				
				for(int i = 0; i < numberOfLines; i++)
					{
						String tempArray = myFile.nextLine();
						String[] filler = tempArray.split(" ");

						StudentList.add(new Student(filler[i], filler[i + 1]));

					}
				
				
			}

	}
