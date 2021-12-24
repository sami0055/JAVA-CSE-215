package Metdods;

public class MethodOverloading {
    static int max(int x,int y) {
    	return x>y?x:y;
    }
    static float max(float x,int y) {
    	return x>y?x:y;
    }
    static int max(int x,int y,int z) {
      if(x>y && x>z)
    	  return x;
      else if (y>z)
    	  return y;
      else 
    	  return z;
    }
	public static void main(String[] args) {
		System.out.println(max(6,7));
        System.out.println(max(33.5f,544));
        System.out.println(max(6,7,77));
	}

}
