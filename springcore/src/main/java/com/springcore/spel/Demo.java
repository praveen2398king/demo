package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*Video-25 SPEL Spring Experession Language*/

@Component
public class Demo {
	
	@Value("#{T(java.lang.Math).sqrt(25)}") /* Video-26 How to Invoke static method */
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	@Value("#{new java.lang.String('Praveen Kumar Singh')}") /*		*/
	private String name;
	
	@Value("#{3<8}")
	private boolean flag;
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Value("#{35>56?30:70}")
	private int x;
	@Value("#{35+15}")
	private int y;
	@Override
	public String toString() {
		return "Demo [z=" + z + ", e=" + e + ", name=" + name + ", flag=" + flag + ", x=" + x + ", y=" + y + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}
