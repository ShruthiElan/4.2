
import java.io.IOException;
import org.apache.hadoop.io.Text;
//import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Reducer;

public class Task1Reducer extends Reducer< Text, LongWritable, Text, LongWritable>
{	
	LongWritable count1=new LongWritable();
	public void reduce(Text key, Iterable<LongWritable> values,Context context) throws IOException, InterruptedException
	{
		int n=0;
		for (LongWritable value : values) {
				n+= value.get();
			}
		count1.set(n);

		context.write(key, count1);
	}
}
