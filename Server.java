import java.lang.*;
import java.net.*;
import java.io.*;

class Server
{
	public static void  main(String arg[])throws Exception
	{
		System.out.println("Server application is running...");
		String s1=null,s2=null;
		Socket s=null;
		BufferedReader br=null,brk=null;
		PrintStream ps=null;
		
			ServerSocket ss=new ServerSocket(1100);
			 s=ss.accept();
			
			System.out.println("Connection Successfull");
			 brk=new BufferedReader(new InputStreamReader(System.in));
			 br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			 ps=new PrintStream(s.getOutputStream());
			while((s1=br.readLine())!=null)
			{
				System.out.println("Client Says: "+s1);
				System.out.println("Enter message for Client:  ");
				s2=brk.readLine();
				ps.println(s2);
			}
			
			
					ss.close();
					br.close();
					brk.close();
					ps.close();
				
		}
		
	}

