package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader r = new BufferedReader(new FileReader("KLSadd.tex"));//reads file
		BufferedWriter w = new BufferedWriter(new FileWriter("mCase.tex"));//writes new file
		
		String line;
		while((line = r.readLine())!=null)//loops through each line 
		{
			String[] splitLine = line.split(" ");//splits at spaces
			for(int i = 0;i<splitLine.length;i++)
			{
				String word = splitLine[i];
				if(!splitLine[i].contains("\\"))//looks for slashes in words+escape
				{
					word = word.replace("m", "~");//replaces lowercase with placeholder
					word = word.replace("M", "m");//upper to lower
					word = word.replace("~", "M");//placeholder to upper
					System.out.println("After "+word);//displays word for debugging
				}
				w.write(word);
				w.write(" ");//replaces space
			}
			w.write("\n");//new line
		}
		
		w.close();
		
	}
}
