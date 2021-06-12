import java.util.concurrent.TimeUnit;
import java.util.*;
import java.io.*;
import java.time.LocalTime;

class methods{

public void countdown() throws InterruptedException
    {
        //countdown (3,2,1,GOOOO)
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);
    }
    public void fileWordPrinter() throws IOException
    {
        
        File file = new File("words.txt");   //najde file
        BufferedReader reader = new BufferedReader(new FileReader(file));    //omogočimo branje datoteke sskj.txt

        String words =  "";  //dodan String samo zato da je lažje izpisati besede
        while(reader.ready())    //while zanka prebere vse besede
        {
            words += reader.readLine() + " ";
        }

        String parts[] = words.split(" ");  //parts tukaj pomeni kot ena beseda posebej, katero je mogoče z metodo split

        /*for(int i = 0; i < parts.length;i++) {
            System.out.println("------>"  + parts[i]);

        }*/
        

        Random rand = new Random();
        int stBesed = rand.nextInt(15)+1; 

        for(int i = 0; i < stBesed; i++)    //for zanka za izpis random 1-15 besed
        {

            System.out.print(parts[rand.nextInt(parts.length)] + " ");

        }
        System.out.println();
    }
	public void mainMethod() throws IOException 
    {
        
        double start = LocalTime.now().toNanoOfDay();   //timer se začne po countdownu
        Scanner scan2 = new Scanner(System.in);     //dodamo moznost pisanja v command prompt
        String typedWords = scan2.nextLine();   //pisemo v nextline 

        double end = LocalTime.now().toNanoOfDay(); //se konča ko klikneš enter

        double elapsedTime = end - start;   //izračuna koliko milisekund si potreboval za napisat 

        double seconds = elapsedTime / 1000000000.0; //izračuna iz milisekund v sekunde (9 ničel)
        int numChars = typedWords.length(); //nam pove koliko besed je imel stavek
        // ( charaters / 5) / 1min = y WPM <--- enačba za izračun words per minute 

        int wpm = (int)((((double) numChars / 5) / seconds) * 60); //zračunana wpm

        System.out.println("Vaš wpm je: " + wpm + "!"); //izpis
        scan2.close();
        
        String newWPM = String.valueOf(wpm); //intiger wpm spremenimo v string newWPM
        PrintWriter writer = new PrintWriter(new FileWriter("allWPM.txt",true));//izpiše wpm v datoteko allWPM.txt

        writer.println(newWPM); //jih izpiše
        writer.close();
	}
}
