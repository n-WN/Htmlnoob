package PACK6;/*
 *@copyright by LzyRapx on 2016/4/12.
 *@name:java学生成绩管理系统.
 *@功能：学生相关信息，录入，查询，统计，修改等....
 *@PS：图形界面的学生管理系统不要求就不做了.
 */

import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Student
{
    private static Student[] s=new Student[100]; //录入学生上限
    int n=0;
    private String name;
    private int num;
    private String classAge;
    private int chinese;
    private int  math;
    private int english;

    //判断是否有录入学生信息
    public void judge() throws IOException
    {
        int i;
        char ch;
        String str;
        Scanner In=new Scanner(System.in);
        if(n==0)
        {
            System.out.println("你还没有录入任何学生信息，是否录入(Y/N):");
            str=In.next();
            ch=str.charAt(0);
            while(ch!='Y'&&ch!='y'&&ch!='N'&&ch!='n')
            {
                System.out.println("输入有误，请重新输入:");
                str=In.next();
                ch=str.charAt(0);
            }
            if(ch=='Y'||ch=='y')
            {
                this.add();
            }
            if(ch=='N'||ch=='n')
            {
                this.menu();
            }
        }
    }

    //菜单
    public void menu() throws IOException  //将异常抛出，调用这个方法去处理异常,如果main方法也将异常抛出，则交给Java虚拟机来处理,下同.
    {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("*************学生信息管理系统*************");
        System.out.println("*****        1.录入学生信息            ******");
        System.out.println("*****        2.显示学生信息            ******");
        System.out.println("*****        3.修改学生信息            ******");
        System.out.println("*****        4.删除学生信息            ******");
        System.out.println("*****        5.查看学生信息            ******");
        System.out.println("*****        0.退出管理系统            ******");
        System.out.println("******************************************");
        System.out.print("请选择(0~5):");
        a=in.nextInt();
        while(a<0||a>5)
        {
            System.out.print("输入无效，请重新输入:");
            a=in.nextInt();
        }
        switch(a)
        {
            case 1:this.add();break;
            case 2:this.show();break;
            case 3:this.modif();break;
            case 4:this.delete();break;
            case 5:this.look();break;
            case 0:System.out.println("成功退出系统！！！");System.exit(0);break;
        }
    }

    //录入学生信息
    public void add() throws IOException
    {
        String str,str1,str2;
        int i,num1,t=1;
        char ch,ch1;
        FileWriter fw=new FileWriter("E://student.txt",true);   //将学生信息录入指定的txt文件中

        fw.write("             录入的学生信息列表\r\n\r\n学号    姓名    班级    语文成绩      数学成绩    英语成绩\r\n");
        Scanner In=new Scanner(System.in);
        while(t==1)
        {
            System.out.println("请输入学生学号:");
            num1=In.nextInt();

            //判断学号是否重复
            for(i=0;i<n;i++)
            {
                while(s[i].num==num1)
                {
                    System.out.println("已存在此学号，请重新输入");
                    System.out.print("请输入学号:");
                    num1=In.nextInt();
                }
            }
            s[n].num=num1;
            str2=String.valueOf(num1);
            fw.write(str2+"    ");
            System.out.println();
            System.out.println("请输入学生姓名:");
            s[n].name=In.next();
            fw.write(s[n].name+"      ");
            System.out.println();
            System.out.println("请输入学生班级:");
            s[n].classAge=In.next();
            fw.write(s[n].classAge+"  ");
            System.out.println("请输入学生语文成绩:");
            s[n].chinese=In.nextInt();
            fw.write(s[n].chinese+"  ");
            System.out.println("请输入学生数学成绩:");
            s[n].math=In.nextInt();
            fw.write(s[n].chinese+"  ");
            System.out.println("请输入学生英语成绩:");
            s[n].english=In.nextInt();
            fw.write(s[n].english+"\r\n");
            ++n;
            fw.close();
            System.out.println();
            System.out.println("是否继续添加(Y/N)");
            str=In.next();
            ch=str.charAt(0);
            while(ch!='N'&&ch!='n'&&ch!='Y'&&ch!='y')
            {
                System.out.println("输入无效，请重新输入:");
                str=In.next();
                ch=str.charAt(0);
            }
            if(ch=='N'||ch=='n')
            {
                break;
            }
        }
        System.out.println();
        System.out.print("是否返回系统主菜单(Y/N)");
        str1=In.next();
        ch1=str1.charAt(0);
        while(ch1!='Y'&&ch1!='y'&&ch1!='N'&&ch1!='n')
        {
            System.out.println("输入无效，请重新输入:");
            str1=In.next();
            ch1=str1.charAt(0);
        }
        if(ch1=='Y'||ch1=='y')
        {
            this.menu();
        }
        if(ch1=='N'||ch1=='n')
        {
            System.out.println("");
            System.out.println("你已退出系统！！！");
            System.exit(0);
        }
    }

    //显示学生信息
    public void show() throws IOException
    {
        int i;
        this.judge();
        System.out.println("本次操作共录入"+n+"位学生!");
        System.out.println("你录入的学生信息如下:");
        System.out.println();
        System.out.println("学号\t姓名\t班级\t语文\t数学\t英语");
        for(i=0;i<n;i++)
        {
            System.out.println(s[i].num+"      "+s[i].name+"     "+s[i].classAge+"     "+s[i].chinese+"      "+s[i].math+"     "+s[i].english);
        }
        System.out.println("系统返回主菜单!");
        this.menu();
    }

    //删除学生信息
    public void delete() throws IOException
    {
        this.judge();
        int j=0,t=0,k=0,num1;
        char ch;
        String str;
        Scanner pin=new Scanner(System.in);
        System.out.println("请输入要删除的学号:");
        num1=pin.nextInt();
        for(j=0;j<n;j++)
        {
            if(s[j].num==num1)
            {
                k=1;
                t=j;
            }
        }
        if(k==0)
        {
            System.out.println("对不起！你要删除的学号不存在！");
            System.out.println("系统将返回主菜单！");
            this.menu();
        }
        if(k==1)
        {
            System.out.println("你要删除的学生信息如下:");//打印管理员要删除的学生信息
            System.out.println("学号\t姓名\t班级");//本功能暂时不备扩展性
            System.out.println(s[t].num+"      "+s[t].name+"      "+s[t].classAge);
            System.out.println();
            System.out.println("你确定要删除(Y/N):");
            str=pin.next();
            ch=str.charAt(0);
            while(ch!='Y'&&ch!='y'&&ch!='N'&&ch!='n')
            {
                System.out.println("输入无效，请重新输入:");
                str=pin.next();
                ch=str.charAt(0);
            }
            if(ch=='N'||ch=='n')
            {
                System.out.println();
                System.out.println("系统返回主菜单！");
                this.menu();
            }
            if(ch=='Y'||ch=='y')
            {
                for(j=t;j<n-1;j++)
                {
                    s[j]=s[j+1];
                }
                n--;
                System.out.println("学生数据成功删除!");
                System.out.println("系统返回主菜单!");
                this.menu();
            }
        }
    }
    //查看学生信息
    public void look() throws IOException
    {
        FileReader fr=new FileReader("E://student.txt");  //查看txt中的学生信息
        int a;
        while((a=fr.read())!=-1)
        {
            System.out.print((char)a);
        }
        fr.close();
        System.out.println("系统返回主菜单！");
        System.out.println();
        this.menu();
    }

    //修改学生信息
    public void modif() throws IOException
    {
        this.judge();
        int j=0,t=0,k=0,num2,num3,moi,c=1;
        char ch;
        String str,str1,str2;
        Scanner pin=new Scanner(System.in);
        System.out.println("请输入要修改的学号:");
        num2=pin.nextInt();
        for(j=0;j<n;j++)
        {
            if(s[j].num==num2)
            {
                k=1;
                t=j;
            }
        }
        if(k==0)
        {
            System.out.println("对不起！你要修改的学号不存在！");
            System.out.println("系统将返回主菜单！");
            this.menu();
        }
        if(k==1)
        {
            //打印将要要删除的学生信息
            System.out.println("你要修改的学生信息如下:");
            System.out.println("学号\t姓名\t班级");
            System.out.println(s[t].num+"      "+s[t].name+"      "+s[t].classAge);
            System.out.println("语文\t数学\t英语");
            System.out.println(s[t].chinese+"      "+s[t].math+"      "+s[t].english);
            System.out.println();
            System.out.println("你确定要修改(Y/N):");
            str=pin.next();
            ch=str.charAt(0);
            while(ch!='Y'&&ch!='y'&&ch!='N'&&ch!='n')
            {
                System.out.println("输入无效，请重新输入:");
                str=pin.next();
                ch=str.charAt(0);
            }
            if(ch=='N'||ch=='n')
            {
                System.out.println();
                System.out.println("系统返回主菜单！");
                this.menu();
            }
            while(c==1)
            {
                if(ch=='Y'||ch=='y')
                {
                    System.out.println("****************************************");
                    System.out.println("*****         1.修改学号           *****");
                    System.out.println("*****         2.修改班级           *****");
                    System.out.println("*****         3.修改姓名           *****");
                    System.out.println("****************************************");
                    System.out.println("请选择:");
                    moi=pin.nextInt();
                    switch(moi)
                    {
                        case 1:System.out.print("请输入新的学号:");num3=pin.nextInt();s[t].num=num3;break;
                        case 2:System.out.print("请输入新的班级:");str1=pin.next();s[t].classAge=str1;break;
                        case 3:System.out.print("请输入新的姓名:");str2=pin.next();s[t].name=str2;break;
                    }
                    System.out.println("数据已成功修改！");
                }
                System.out.print("是否继续修改(Y/N)");
                str=pin.next();
                ch=str.charAt(0);
                System.out.println();
                while(ch!='Y'&&ch!='y'&&ch!='N'&&ch!='n')
                {
                    System.out.print("输入无效，请重新输入:");
                    str=pin.next();
                    ch=str.charAt(0);
                }
                if(ch=='N'||ch=='n')
                {
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("系统返回主菜单！");
        this.menu();
    }

    public static void main(String[] args) throws IOException
    {
        Student stu=new Student();
        for(int i=0;i<100;i++)
        {
            s[i]=new Student();
        }
        stu.menu();
    }
}