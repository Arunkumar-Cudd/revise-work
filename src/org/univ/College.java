package org.univ;

public class College extends University{
public void ug() {
System.out.println("UG completed in Mahavir College");
}
public void pg() {
System.out.println("PG completed in Mahavir College");	

}
	public static void main(String[] args) {
	College c = new College();
	c.ugg();
	c.pg();
	}
}
