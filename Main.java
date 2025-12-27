import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] nameStudent=new String[1000];
        String[] idNumStudent=new String[1000];
        float[] ccNotesStudent=new float[1000];
        float[] tpNotesStudent=new float[1000];
        float[] snNotesStudent=new float[1000];
        float[] totalStudent=new float[1000];
        float[][] gpaStudent=new float[1000][1000];
        String[]gradeStudent=new String[1000];
    
        String name="james";
        String id="25H2673";
        String grade="CA";
        float cc=20;
        float sn=70;
        float tp=10;
        float total=100;
        double gpa=4;

        int length=3;
        int research=0;
        String[] tabName={"john","mary","peter"};
        String[] tabIdNum={"25H001","25H002","25HOO3"};
        float[] tabCC={12,15,8};
        float[] tabTP={10,5,8};
        float[] tabSN={55,60,15};
        float[] tabTotal={77,80,31};
        double[] tabGPA={3.7,4,0};
        String[] tabGRADE={"CA","A","NA"};
        System.out.println("what do you want to do?");
        System.out.println("  options");
        System.out.println("1.register the notes of students");
        System.out.println("2.check information on a student");
        System.out.println("3.modify information on a student");
        int ans=sc.nextInt();

        switch (ans) {
            case 1:
                int n=getInt( sc,"enter the number of students to register");
                System.out.println("course INF151");
                System.out.println("course INF111");
                System.out.println("course INF121");
                System.out.println("course INF141");
                System.out.println("course INF131");
                System.out.println("course PHY161");
                System.out.println("course MATH131");
                int x=getInt( sc,"how many course(s) do you want to register for each student?");
                while(x<0||x>5){
                    x=getInt( sc,"how many course(s) do you want to register for each student?");
                }
                int[][] t=new int[x][n];
                float sum=0;
                int i,j;
                for(i=0;i<x;i++){
                    System.out.println("enter the information of the "+n+" student concerning course "+(i+1));
                    for( j=0;j<n;j++){
                        System.out.println("enter the information of the "+(j+1)+" student");
                        nameStudent[i]=sc.nextLine();
                        nameStudent[i]=getStringForName( sc,"enter the name of student "+(j+1),50);
                        idNumStudent[i]=getStringForId( sc,"enter the identification number of the student "+(j+1),7);
                        ccNotesStudent[i]= getFloat( sc,"enter the cc mark of the student "+(j+1));
                        while(ccNotesStudent[i]>20){
                            System.out.println("incorrect mark try back");
                            ccNotesStudent[i]= getFloat( sc,"enter the cc mark of the student "+(j+1));
                        }
                        tpNotesStudent[i]=getFloat( sc,"enter the tp mark of the student "+(j+1));
                        while(tpNotesStudent[i]>10){
                            System.out.println("incorrect mark try back");
                            tpNotesStudent[i]=getFloat( sc,"enter the tp mark of the student "+(j+1));
                        }
                        snNotesStudent[i]=getFloat( sc,"enter the sn mark of the student "+(j+1));
                        while(snNotesStudent[i]>70){
                            System.out.println("incorrect mark try back");
                            snNotesStudent[i]=getFloat( sc,"enter the sn mark of the student "+(j+1));
                        }
                    } 
                }
                    for( i=0;i<n;i++){
                        totalStudent[i]=ccNotesStudent[i]+tpNotesStudent[i]+ snNotesStudent[i];
                    }
                    for( i=0;i<x;i++){
                    for( j=0;j<n;j++){
                        if(totalStudent[i]<=35){
                            gpaStudent[i][j]=0;
                             gradeStudent[i]="NA";  //not acquired or not acquired
                        }    
                        if(totalStudent[i]>=35&&totalStudent[i]<45){
                            gpaStudent [i][j]=1;
                            gradeStudent[i]="PA"; //in the process of acquisition
                        }            
                        if(totalStudent[i]>=40&&totalStudent[i]<45){
                            gpaStudent[i][j]=(float)1.3;
                            gradeStudent[i]="PA";
                        }
                        if(totalStudent[i]>=45&&totalStudent[i]<50){
                            gpaStudent[i][j]=(float)1.7;
                            gradeStudent[i]="PA";
                        }    
                        if (totalStudent[i]>=50&&totalStudent[i]<55){
                            gpaStudent[i][j]=2;
                            gradeStudent[i]="PA";
                        }    
                        if(totalStudent[i]>=55&&totalStudent[i]<60){
                            gpaStudent[i][j]=(float)2.3;
                            gradeStudent[i]="PA";
                        }    
                        if(totalStudent[i]>=60&&totalStudent[i]<65){
                            gpaStudent[i][j]=(float)2.7;
                            gradeStudent[i]="PA";
                        }
                        if(totalStudent[i]>=65&&totalStudent[i]<70){
                            gpaStudent[i][j]=3;
                            gradeStudent[i]="PA";
                        }
                        if(totalStudent[i]>=70&&totalStudent[i]<75){
                            gpaStudent[i][j]=(float)3.3;
                            gradeStudent[i]="PA";
                        }    
                        if(totalStudent[i]>=75&&totalStudent[i]<80){
                            gpaStudent[i][j]=(float)3.7;
                            gradeStudent[i]="PA";
                        }    
                        if(totalStudent[i]>=80&&totalStudent[i]<=100){
                            gpaStudent[i][j]=4;
                             gradeStudent[i]="A";    //acquired
                        }
                    }
                    }

                for(i=0;i<x;i++){
                    System.out.println("the information concerning the "+(i+1)+"course are:");
                    for(j=0;j<n;j++){
                    System.out.println("the information concerning student "+(j+1)+" are:");
                    System.out.println("name: "+nameStudent[j]);
                    System.out.println("id number "+idNumStudent[j]);
                    System.out.println("cc notes: "+ccNotesStudent[j]);
                    System.out.println("tp notes: "+tpNotesStudent[j]);
                    System.out.println("sn notes: "+ snNotesStudent[j]);
                    System.out.println("total: "+totalStudent[j]);
                    System.out.println("GPA obtained for the course: "+gpaStudent[i][j]);
                    System.out.println("grade obtained in the course: "+gradeStudent[j]);
                    }
                }
                for( j=0;j<n;j++){
                    for(i=0;i<x;i++){
                        sum+=gpaStudent[j][i];
                    }
                    System.out.println("the total gpa for the "+(j+1)+" student for the semester is "+(sum/x));
                }
                
                    int indexOfLast=0;
                    int indexOfFirst=0;
                    for( i=0;i<n;i++){
                        if(totalStudent[i]>totalStudent[indexOfFirst]){
                            indexOfFirst=i;
                        }
                        if(totalStudent[i]<totalStudent[indexOfLast]){
                            indexOfLast=i;
                        }
                    }
                    System.out.println(" the highest total is: " +totalStudent[indexOfFirst]);
                    System.out.println("the lowest total is: "+totalStudent[indexOfLast]);
            
                System.out.println("the total GPA obtained in all your courses for the semester is: "+(sum/x));
            break;
            case 2:
                sc.nextLine();
                id=getStringForId( sc,"enter the student id number",7);
                for(i=0;i<tabIdNum.length;i++){
                    if(tabIdNum[i]==id){
                        research=i;
                    }
                }
                for(i=0;i<tabName.length;i++){
                    name=tabName[research];
                } 
                for(i=0;i<tabCC.length;i++){
                    cc=tabCC[research];
                } 
                for(i=0;i<tabTP.length;i++){
                    tp=tabTP[research];
                } 
                for(i=0;i<tabSN.length;i++){
                    sn=tabSN[research];
                } 
                for(i=0;i<tabTotal.length;i++){
                    total=tabTotal[research];
                } 
                for(i=0;i<tabGPA.length;i++){
                    gpa=tabGPA[research];
                } 
                for(i=0;i<tabGRADE.length;i++){
                    grade=tabGRADE[research];
                } 

                System.out.println("here are the information concerning the student with id"+id);
                System.out.println("information on INF151");
                System.out.println("name: "+name);
                System.out.println("cc notes: "+cc);
                System.out.println("tp notes: "+tp);
                System.out.println("sn notes: "+sn);
                System.out.println("total marks : "+total);
                System.out.println("gpa for the course: "+gpa);
                System.out.println("grade: "+grade);
            break;
            
        }
        sc.close();
}
public static float getFloat(Scanner sc,String prompt){
    while(true){
        try{
            System.out.println(prompt);
            float value=sc.nextFloat();
            sc.nextLine();
            return value;
        }
        catch(InputMismatchException e){
            System.out.println("invalid float. please enter a float value.");
            sc.next();  //clear invalid input
        }
    }
}
public static String getStringForName(Scanner sc,String prompt,int maxL){   //maxL is the maximum number of characters the string should take
    while(true){
        System.out.println(prompt);
        String input=sc.nextLine();
        if(input.length()<=maxL&&input.matches("[a-zA-Z]+")){
            return input;
        }
        else{
            System.out.println("Invalid input. please enter a string containing only letters and not longer than "+maxL+" characters");
        }
    
    }
}

public static String getStringForId(Scanner sc,String prompt,int maxL){   //maxL is the maximum number of characters the string to take
    while(true){
        System.out.println(prompt);
        String input=sc.nextLine();
        if(input.length()<=maxL&&input.matches("[a-zA-Z0-9]+")){
            return input;
        }
        else{
            System.out.println("Invalid input. please enter a string of the form 25H5572"+maxL+" characters");
        }
    
    }
}



public static int getInt(Scanner sc,String prompt){
    while(true){
        try{
            System.out.println(prompt);
            return sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("invalid integer. please enter an integer value.");
            sc.next();  //clear invalid input
        }
    }
}
}

