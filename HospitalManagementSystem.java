import java.util.*;
class Hosfun
{
    Scanner xc=new Scanner(System.in);
    String pat_name;
    double pat_mobno;
    int pat_icuid;
    int pat_dexid;
    int pat_comid;
    String adderres,diseas,pat_dob,rom;
    int days,amt;
    boolean status=false;
    void setIcid(Hosfun b[])
    {
        for(int i=0;i<b.length;i++)
        {
            b[i].pat_icuid=100+i;
        }
    }
    void setDeid(Hosfun b[])
    {
        for(int i=0;i<b.length;i++)
        {
            b[i].pat_dexid=1000+i;
        }
    }
    void setCoid(Hosfun b[])
    {
        for(int i=0;i<b.length;i++)
        {
            b[i].pat_comid=1+i;
        }
    }
    void setIcu()
    {
        status=true;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Patient bed type : ICU");
        rom="ICU";
        System.out.println("\n Enter patient at bed "+pat_icuid+" details");
        System.out.print("\nPatient name : ");
        xc.nextLine();
        pat_name=xc.nextLine();
        System.out.println();
        System.out.print("Diaseas : ");
        diseas=xc.next();
        System.out.println();
        System.out.print("Patient date of birth : ");
        pat_dob=xc.next();
        System.out.println();
        System.out.print("address : ");
        xc.nextLine();
        adderres=xc.nextLine();
        System.out.println();
        System.out.print("Patient mobile number : ");
        pat_mobno=xc.nextDouble();
        System.out.println("---------------------------------------------------------------------");

    }
    void setCom()
    {
        status=true;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Patient bed type : Common");
        rom="Common";
        System.out.println("\n Enter patient at bed "+pat_comid+" details");
        System.out.print("\nPatient name : ");
        xc.nextLine();
        pat_name=xc.nextLine();
        System.out.println();
        System.out.print("Diaseas : ");
        diseas=xc.next();
        System.out.println();
        System.out.print("Patient date of birth : ");
        pat_dob=xc.next();
        System.out.println();
        System.out.print("address : ");
        xc.nextLine();
        adderres=xc.nextLine();
        System.out.println();
        System.out.print("Patient mobile number : ");
        pat_mobno=xc.nextDouble();
        System.out.println("---------------------------------------------------------------------");

    }
    void setDex()
    {
        status=true;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Patient bed type : Delux");
        rom="Delux";
        System.out.println("\n Enter patient at bed "+pat_dexid+" details");
        xc.nextLine();
        System.out.print("\nPatient name : ");
        pat_name=xc.nextLine();
        System.out.println();
        System.out.print("Diaseas : ");
        diseas=xc.next();
        System.out.println();
        System.out.print("Patient date of birth : ");
        pat_dob=xc.next();
        System.out.println();
        System.out.print("address : ");
        xc.nextLine();
        adderres=xc.nextLine();
        System.out.println();
        System.out.print("Patient mobile number : ");
        pat_mobno=xc.nextDouble();
        System.out.println("---------------------------------------------------------------------");

    }
    int scanIcu(Hosfun G[])
    {
        int g=1;
        for(int i=0;i<G.length;i++)
        {
            if(G[i].status==false)
            {
                g=G[i].pat_icuid;
                G[i].setIcu();
                break;
            }
        }
        return g;
    }
    int scanDex(Hosfun G[])
    {
        int g1=1;
        for(int i=0;i<G.length;i++)
        {
            if(G[i].status==false)
            {
                g1=G[i].pat_dexid;
                G[i].setDex();
                break;
            }
        }
        return g1;
    }
    int scanCom(Hosfun G[])
    {
        int g2=0;
        for(int i=0;i<G.length;i++)
        {
            if(G[i].status==false)
            {
                g2=G[i].pat_comid;
                G[i].setCom();
                break;
            }
        }
        return g2;
    }
    void display()
    {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Patient bed type : "+rom);
        System.out.print("\nPatient name : "+pat_name);
        System.out.println();
        System.out.print("Diaseas : "+diseas);
        System.out.println();
        System.out.print("Patient date of birth : "+pat_dob);
        System.out.println();
        System.out.print("address : "+adderres);
        System.out.println();
        System.out.print("Patient mobile number : "+pat_mobno);
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
    }
    void billPri(String ty)
    {
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Enter the days of admit :");
        days=xc.nextInt();
        System.out.println("\t\t\t PATIENT BILL");
        if(ty.equalsIgnoreCase("icu"))
        {
            System.out.println("Charges for \t\t\t  Amount");
            System.out.println();
            amt=days*5000;
            System.out.println("doctor \t\t\t\t\t\t"+(days*5000));
            amt+=days*2000;
            System.out.println("nurses and staff \t\t\t"+(days*2000));
            amt+=days*2000;
            System.out.println("room and medicines \t\t\t"+(days*2000));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Total payable amount :\t\t"+amt);
        }
        if(ty.equalsIgnoreCase("delux"))
        {
            System.out.println("Charges for \t\t\t  Amount");
            System.out.println();
            amt=days*7000;
            System.out.println("doctor \t\t\t\t\t\t"+(days*7000));
            amt+=days*3000;
            System.out.println("nurses and staff \t\t\t"+(days*3000));
            amt+=days*3000;
            System.out.println("room and medicines \t\t\t"+(days*3000));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Total payable amount :\t\t"+amt);
        }
        if(ty.equalsIgnoreCase("common"))
        {
            System.out.println("Charges for \t\t\t  Amount");
            System.out.println();
            amt=days*2500;
            System.out.println("doctor \t\t\t\t\t\t"+(days*2500));
            amt+=days*1500;
            System.out.println("nurses and staff \t\t\t"+(days*1500));
            amt+=days*750;
            System.out.println("room and medicines \t\t\t"+(days*750));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Total payable amount :\t\t"+amt);
        }

    }
    boolean checkIcu(Hosfun b[],int x)
    {
        boolean e=false;
        for(int i =0;i<b.length;i++)
        {
            if(b[i].pat_icuid==x)
            {
                e=true;
                b[i].display();
                b[i].billPri(b[i].rom);
                b[i].status=false;
                break;
            }
        }
        return e;
    }
    boolean checkCom(Hosfun b[],int x)
    {
        boolean e=false;
        for(int i =0;i<b.length;i++)
        {
            if(b[i].pat_comid==x)
            {
                e=true;
                b[i].display();
                b[i].billPri(b[i].rom);
                b[i].status=false;
                break;
            }
        }
        return e;
    }
    boolean checkDex(Hosfun b[],int x)
    {
        boolean e=false;
        for(int i =0;i<b.length;i++)
        {
            if(b[i].pat_dexid==x)
            {
                e=true;
                b[i].display();
                b[i].billPri(b[i].rom);
                b[i].status=false;
                break;
            }
        }
        return e;
    }

}
class Run
{
    public static void main(String []args)
    {
        System.out.println("Welcome to Hospital Management System");
        Scanner sc=new Scanner(System.in);
        Hosfun pat_delux[]=new Hosfun[10];
        Hosfun pat_common[]=new Hosfun[15];
        Hosfun pat_icu[]=new Hosfun[5];
        Hosfun staff[]=new Hosfun[15];
        for(int i=0;i<pat_icu.length;i++)
        {
            pat_icu[i]=new Hosfun();
        }
        pat_icu[0].setIcid(pat_icu);
        for(int i=0;i<pat_delux.length;i++)
        {
            pat_delux[i]=new Hosfun();
        }
        pat_delux[0].setDeid(pat_delux);
        for(int i=0;i<pat_common.length;i++)
        {
            pat_common[i]=new Hosfun();
        }
        pat_common[0].setCoid(pat_common);
        int con=0;

        while(con==0)
        {
            System.out.println("\n Select a number for their corresponding.");
            System.out.println(" 1. Patient Entry");
            System.out.println(" 2. Patient Discharge");
            System.out.println(" 3. Staff Recruitment");
            System.out.println(" 4. Staff Fired");
            System.out.println(" 5. Inquiry of staff or contacts ");
            System.out.println(" 6. List of present patients");
            int set_fun=sc.nextInt();
            switch(set_fun)
            {
                case 1:
                    System.out.print("Enter Patient Condition (Critical or Common) : ");
                    String cas=sc.next();
                    if(cas.equalsIgnoreCase("critical"))
                    {
                            Hosfun ob = new Hosfun();
                            int g = ob.scanIcu(pat_icu);
                            if(g==1)
                            {
                                System.out.println("No ICU beds available");
                            }
                    }


                    else
                    {
                        System.out.println("preference of bed : Delux or Common ");
                        String cas1=sc.next();
                        if(cas1.equalsIgnoreCase("delux"))
                        {
                            Hosfun ob1 = new Hosfun();
                            int g1 = ob1.scanDex(pat_delux);
                            if(g1==1)
                            {
                                System.out.println("\n No Delux beds available");
                            }

                        }
                        else
                        {
                            Hosfun ob2 = new Hosfun();
                            int g2 = ob2.scanCom(pat_common);
                            if(g2==0)
                            {
                                System.out.println("\n No Common beds available");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter bed id : ");
                    int chk=sc.nextInt();
                    if(chk>99&&chk<106)
                    {
                        boolean cq1;
                        Hosfun c1 = new Hosfun();
                        cq1=c1.checkIcu(pat_icu,chk);
                        if(cq1==false)
                        {
                            System.out.println("Invalid bed id");
                        }
                    }
                    if(chk>999&&chk<1011)
                    {
                        boolean cq2;
                        Hosfun c2 = new Hosfun();
                        cq2=c2.checkDex(pat_delux,chk);
                        if(cq2==false)
                        {
                            System.out.println("Invalid bed id");
                        }
                    }
                    if(chk>0&&chk<16)
                    {
                        boolean cq3;
                        Hosfun c3 = new Hosfun();
                        cq3=c3.checkCom(pat_common,chk);
                        if(cq3==false)
                        {
                            System.out.println("Invalid bed id");
                        }
                    }
                    break;

                case 3:
                case 4:
                case 5:
                case 6:
                default:
            }
        }
    }
}