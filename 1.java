import java.util.Scanner;
class InvoiceTest{
String pno;
String pdes;
int pquan = 0;
double pitem=0.0;
public InvoiceTest(String pno,String pdes,int pquan,double pitem){
this.pno=pno;
this.pdes=pdes;
if (pquan<0){
this.pquan=0;
}
else
 this.pquan=pquan;
if (pitem<0)
this.pitem=0.0;
else
this.pitem=pitem;
}
public void getInvoiceAmount(){
System.out.println("Invoice Details:");
System.out.println("Part Number: "+this.pno);
System.out.println("Part Description: "+this.pdes);
System.out.println("Quantity: "+this.pquan);
System.out.println("Price per Item: "+this.pitem);
System.out.println("Invoice Amount: "+this.pquan*this.pitem);
}
}
public class Invoice{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter Part Number: ");
String pno=sc.nextLine();
System.out.print("Enter Part Description: ");
String des =sc.nextLine();
System.out.print("Enter Quantity: ");
int quan=sc.nextInt();
System.out.print("Enter Price per Item: ");
double price=sc.nextDouble();
InvoiceTest Invoice_1=new InvoiceTest(pno,des,quan,price);
Invoice_1.getInvoiceAmount();
}
}
