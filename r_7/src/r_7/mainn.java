package r_7;

public class mainn {

	public static void main(String[] args) {
        
		int t1 =(int)(Math.random()*24);
		int t2 =(int)(Math.random()*24);
		int t3 =(int)(Math.random()*24);
		int t4 =(int)(Math.random()*24);
		int T1,T2,T;
		T1=t1+t3;
		T2=t4-t2;
		System.out.println(T1);
		System.out.println(T2);
		if (T2>=18) {
			  System.out.println("Evening");
			} 
		else if(T2<=18 || T2>=12) {
			  System.out.println("Day");
			}
			else if(T2>=6 || T2<=12) {
				  System.out.println("Morning");
				}
			else if(T2<=6) {
				  System.out.println("Night");
				}
		if (T1 >= 18) {
			  System.out.println("Evening");
			} else if(T1<=18 || T2>=12) {
			  System.out.println("Day");
			}
			else if(T1>=6 || T1<=12) {
				  System.out.println("Morning");
				}
			else if(T1<=6) {
				  System.out.println("Night");
				}
		if(T1>T2) {
			System.out.println("T1");
		}else {
			System.out.println("T2");
		}
		}
}
