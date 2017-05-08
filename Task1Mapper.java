package one;

import java.io.IOException;
import java.util.regex.Pattern;

//import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.*; 

public class Task1Mapper extends Mapper<LongWritable, Text, Text, LongWritable> {
	LongWritable n=new LongWritable(1);
	public void map(LongWritable key, Text value, Context context) 
			throws IOException, InterruptedException {
		String[] lineArray = value.toString().split(Pattern.quote("|"));
		Text company= new Text(lineArray[0]);
		if(!(lineArray[0].equals("NA")||lineArray[1].equals("NA")))
		{
		context.write(company,n);
		}
		
	}
}
