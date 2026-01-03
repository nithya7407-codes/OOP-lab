class FindAvg{
   int findavg(int a,int b,int c)
    {    return(a+b+c)/3;  }
public static void main(String [] args){
       FindAvg obj=new FindAvg();
       int avg=obj.findavg(10,20,30);
       System.out.println("Average is: "+ avg);
    }
}