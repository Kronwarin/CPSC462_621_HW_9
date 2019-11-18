import java.io.*;
public class j0703 {
  public static void main (String args[]) throws IOException {
    int i = 0;
    String b;
    String[] fields;
    String[] recs = new String[100]; // only 3 records
    FileReader fin = new FileReader("orders.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      recs[i] = b;
      i = i + 1;
    }
    fin.close();
    FileOutputStream fout1 = new FileOutputStream("output1.txt");
    BufferedOutputStream bout1 = new BufferedOutputStream(fout1);
    PrintStream pout1 = new PrintStream(bout1 );
    for(int j=0;j<i;j++) {
      fields = recs[j].split(",");
	if(fields[5].equals("1401"))
      pout1.println(fields[0]+","+fields[1]+","+fields[2]+","+fields[3]+","+fields[4]+","+fields[5]);
    }
    pout1.close();

     FileOutputStream fout2 = new FileOutputStream("output2.txt");
    BufferedOutputStream bout2 = new BufferedOutputStream(fout2);
    PrintStream pout2 = new PrintStream(bout2);
    for(int j=0;j<i;j++) { 
      fields = recs[j].split(",");
	if(fields[5].equals("1402"))
      pout2.println(fields[0]+","+fields[1]+","+fields[2]+","+fields[3]+","+fields[4]+","+fields[5]);
    }
    pout2.close();

	FileOutputStream fout3 = new FileOutputStream("output3.txt");
    BufferedOutputStream bout3 = new BufferedOutputStream(fout3);
    PrintStream pout3 = new PrintStream(bout3);
    for(int j=0;j<i;j++) { 
      fields = recs[j].split(",");
	if(fields[5].equals("1403"))
      pout3.println(fields[0]+","+fields[1]+","+fields[2]+","+fields[3]+","+fields[4]+","+fields[5]);
    }
    pout3.close();

  }
}