package p1;

public class Employee {
private String EMP_ID;
private String EMP_NAME;
private Address addr; //it will be used for one to one mapping

public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}
public String getEMP_ID() {
	return EMP_ID;
}
public void setEMP_ID(String EMP_ID) {
	this.EMP_ID = EMP_ID;
}
public String getEMP_NAME() {
	return EMP_NAME;
}
public void setEMP_NAME(String EMP_NAME) {
	this.EMP_NAME = EMP_NAME;
}
}
