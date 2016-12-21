package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

	public class allCase 
	{
		public static void main(String[] args) throws IOException
		{
			BufferedReader r = new BufferedReader(new FileReader("KLSadd.tex"));
			BufferedWriter w = new BufferedWriter(new FileWriter("allCase.tex"));
			
			String line;
			while((line = r.readLine())!=null)
			{
				String[] splitLine = line.split(" ");
				for(int i = 0;i<splitLine.length;i++)
				{
							
					String word = splitLine[i];
					if(!splitLine[i].contains("\\"))
					{
			
						for (int j = 0; j < 26; j++)
						{
						    char upper = (char) ('A' + j);
						    char lower = (char) ('a' + j);
																
						    	   //line.replace(alphabet.substring(i,i+1),"~");
						
						    	   word = word.replace(lower, '~');
						    	   word = word.replace(upper, lower);
						    	   word = word.replace('~', upper);
						    	   System.out.println(word);
					
						}
						
					}
					w.write(word);
					w.write(" ");      
				}
				w.write("\n"); 
			}
			w.close();
						
		}

	}
