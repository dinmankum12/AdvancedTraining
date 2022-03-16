package Question8;

//****************************************************************************************************//

import java.io.IOException;

 import java.nio.file.Files;

 import java.nio.file.Paths;



 import java.lang.Runnable;





 class FileScanner implements Runnable

 {

    private String filename;

    private String [] targetStrings;

    private String monikerName;



    public FileScanner(String filename, String [] targetStr,String name)

    {

         this.filename = new String(filename);

         this.monikerName = new String(name);

      

         this.targetStrings = new String[4];



         for (int iLoop=0; iLoop<4; iLoop++)

         {

            this.targetStrings[iLoop] = new String(targetStr[iLoop]);

         }



    }



   public void run()

   {

       try

       {

          String content = new String(Files.readAllBytes(Paths.get(filename)));

          System.out.println(content);



          int strlen = content.length();



          for (int iLoop=0; iLoop<4; iLoop++)

          {

            int iIndexPos= -1;

            while (iIndexPos<strlen)

            {

                int iTemp = content.indexOf(targetStrings[iLoop],iIndexPos+1);

                if (iTemp>=0)

                {

                      System.out.println(this.monikerName + " : target string " + targetStrings[iLoop] + " at index " + iTemp);

                      iIndexPos = iTemp;

                }

                else

                {

                   break;

                }

              

            }

          }

       }

       catch (IOException ex) { System.out.println("IO Exception "); }

   }



 }



 class FileThread

 {

     

    public static void main(String args[])

    {

        if (args.length!=6)

        {

              System.out.println(" java FileThread filename1 filename1 targetStr1 targetStr2 targetStr3 targetStr4");

        }

        else

        {

               String targetStrings[] = new String[4];



               targetStrings[0] = new String(args[2]);

               targetStrings[1] = new String(args[3]);

               targetStrings[2] = new String(args[4]);

               targetStrings[3] = new String(args[5]);

              

               FileScanner fileScanner1 = new FileScanner(args[0],targetStrings,"scanner1");

               FileScanner fileScanner2 = new FileScanner(args[1],targetStrings,"scanner2");

               fileScanner1.run();

               fileScanner2.run();

        

         }



    }





 }

