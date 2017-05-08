package one;

import java.io.IOException;
import java.util.regex.Pattern;

//import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.*; 

public class Task2Mapper extends Mapper<LongWritable, Text, Text, LongWritable> {
	LongWritable n=new LongWritable(1);
	public void map(LongWritable key, Text value, Context context) 
			throws IOException, InterruptedException {
		String[] lineArray = value.toString().split(Pattern.quote("|"));
		Text company= new Text(lineArray[0]);
		if(state.equals("Onida"))
			{
				
			
		context.write(state,n);
		}
		context.write(company,n);
		}
		
	}
}
