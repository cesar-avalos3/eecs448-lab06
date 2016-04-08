import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class VotingSystem 
{
	public static boolean vote(String name, String lastname, String candidate) throws IOException
	{
		if(!name.isEmpty() && !lastname.isEmpty())
		{
		
			File file = new File(""+lastname+"_"+name+"_ballot.txt");
			String toWrite = "Candidate: "+candidate;			
					if(file.createNewFile())
					{
						FileOutputStream out = new FileOutputStream(file);
						byte[] candidateToBytes = toWrite.getBytes();
						out.write(candidateToBytes);
						out.flush();
						out.close();
					}
					else
					{
						return false;
					}
					return true;
		}
		return false;
	}
}
